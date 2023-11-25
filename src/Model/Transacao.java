package Model;

import java.util.Date;

public class Transacao {

    private Date data;
    private String tipoTransacao;
    private double valor;
    private double saldoResultante;

    public Transacao(Date data, String tipoTransacao, double valor, double saldoResultante) {
        this.data = data;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.saldoResultante = saldoResultante;
    }

    public Transacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getData() {
        return data;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public double getValor() {
        return valor;
    }

    public double getSaldoResultante() {
        return saldoResultante;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setSaldoResultante(double saldoResultante) {
        this.saldoResultante = saldoResultante;
    }

}
