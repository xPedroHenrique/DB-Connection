package DAO;

import Model.Conta;
import Model.Transacao;
import java.util.List;
import java.util.UUID;

public interface ContaDAO {

    public void insereConta(Conta conta);
    public Conta buscarContaDocumentoTitular(String documento);
    public void atualizaSaldo(Conta conta);
    public List<Transacao> buscarTransacoesDaConta(UUID conta);

}
