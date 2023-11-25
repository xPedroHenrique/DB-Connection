package Controller;

import static Factory.FactoryDAO.makeContaDAO;
import Model.Conta;
import Model.ContaCorrente;
import Model.ContaPoupanca;
import Model.ContaSalario;
import Model.Pessoa;
import Model.Transacao;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;

public class ContaController {

    public int criaConta(Pessoa pessoa, boolean corrente, boolean poupanca, boolean salario, String senha) {
        Conta conta = corrente ? new ContaCorrente(pessoa, senha) : poupanca ? new ContaPoupanca(pessoa, senha) : new ContaSalario(pessoa, senha);
        makeContaDAO().insereConta(conta);
        return conta.getNumero();
    }

    public Object buscarContaDocumento(String documento) {
        return makeContaDAO().buscarContaDocumentoTitular(documento);
    }

    public Conta depositar(Conta conta, double valor) {
        if (valor > 0) {
            conta.depositar(valor);
            makeContaDAO().atualizaSaldo(conta);
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
        }
        return conta;
    }

    public Conta sacar(Conta conta, double valor) {
        if (valor <= conta.getSaldo() && valor > 0) {
            conta.sacar(valor);
            makeContaDAO().atualizaSaldo(conta);
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Valor Inválido ou saldo insuficiente!");
        }
        return conta;
    }

    public Conta transferir(Conta conta, Conta destinatario, double valor) {
        if (conta.getSaldo() >= valor && valor > 0) {
            conta.transferir(destinatario, valor);
            makeContaDAO().atualizaSaldo(conta);
            makeContaDAO().atualizaSaldo(destinatario);
            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Valor Inválido ou saldo insuficiente!");
        }

        return conta;
    }

    public List<Transacao> buscarTransacoesDaConta(UUID conta) {
        return makeContaDAO().buscarTransacoesDaConta(conta);
    }
}
