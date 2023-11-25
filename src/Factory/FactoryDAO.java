package Factory;

import DAO.ContaDAO;
import DAO.MySQL.ContaDAOMySQL;
import DAO.MySQL.PessoaDAOMySQL;
import DAO.PessoaDAO;
import Util.Gerenciador;
import java.sql.Connection;

public class FactoryDAO {

    public static ContaDAO makeContaDAO() {
        Connection conexao = Gerenciador.getConexao();
        ContaDAOMySQL contaDAO = new ContaDAOMySQL(conexao);
        return contaDAO;
    }

    public static PessoaDAO makePessoaDAO() {
        Connection conexao = Gerenciador.getConexao();
        PessoaDAO pessoaDAO = new PessoaDAOMySQL(conexao);   
        return pessoaDAO;

    }
}
