package Controller;

import static Factory.FactoryDAO.makePessoaDAO;
import Model.Pessoa;
import Model.PessoaFisica;
import Model.PessoaJuridica;

public class PessoaController {

    public Pessoa criarPessoa(String nome, String documento, String tipo) {
        Pessoa pessoa = null;
        if (tipo.equals("Pessoa Física")) {
            pessoa = new PessoaFisica(nome, documento);
        } else {
            pessoa = new PessoaJuridica(nome, documento);
        }

        makePessoaDAO().inserirPessoa(pessoa);
        return pessoa;
    }
}
