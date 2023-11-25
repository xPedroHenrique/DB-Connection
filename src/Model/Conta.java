package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.mindrot.jbcrypt.BCrypt;

public class Conta {

    public Conta(Pessoa titular, String senha) {
        this.id = UUID.randomUUID();
        this.titular = titular;
        this.saldo = 0.0;
        this.numero = this.gerarNumero();
        this.senha = senha;
        this.senha = BCrypt.hashpw(senha, BCrypt.gensalt());
        this.transacoes = new ArrayList<>();
        this.data = new Date();

    }

    public Conta(UUID id, int numero, double saldo, Pessoa titular, String senha) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.senha = senha;
        this.transacoes = new ArrayList<>();
    }

    private UUID id;
    private int numero;
    private Pessoa titular;
    private String senha;
    double saldo;
    private List<Transacao> transacoes;
    private Date data;

    public String getSenha() {
        return senha;
    }

    public int getNumero() {
        return numero;
    }

    public UUID getId() {
        return id;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        Transacao transacao = new Transacao(new Date(), "Depósito", valor, saldo);
        transacoes.add(transacao);
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.printf(this.titular.getNome() + " - Saldo após saque: R$%.2f \n", this.saldo);

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(Conta destinatario, double valor) {
        this.setSaldo(this.getSaldo() - valor);
        destinatario.setSaldo(destinatario.getSaldo() + valor);
        System.out.printf("%s - Saldo após transferência: R$%.2f\n", this.getTitular().getNome(), this.getSaldo());
        System.out.printf("%s - Saldo após transferência: R$%.2f\n", destinatario.getTitular().getNome(), destinatario.getSaldo());
        Transacao transacaoSaida = new Transacao(new Date(), "saque", valor, this.getSaldo());
        Transacao transacaoEntrada = new Transacao(new Date(), "deposito", valor, destinatario.getSaldo());
        this.adicionarTransacao(transacaoSaida);
        destinatario.adicionarTransacao(transacaoEntrada);

    }

    public boolean validaSenha(String senha) {
        if (senha != null) {
            this.senha = BCrypt.hashpw(senha, BCrypt.gensalt());
        }
        return BCrypt.checkpw(senha, this.senha);
    }

    private int gerarNumero() {
        Random random = new Random();
        return random.nextInt(90000) + 10000;

    }

    public void adicionarTransacao(Transacao transacao) {
        this.setSaldo(saldo);
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public Date getData() {
        return data;
    }
}
