package DAO;

import Model.Pessoa;
import java.util.UUID;

public interface PessoaDAO {

    public void inserirPessoa(Pessoa pessoa);
    public Pessoa obterPessoaID(UUID id);
}
