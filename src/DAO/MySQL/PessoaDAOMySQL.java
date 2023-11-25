package DAO.MySQL;

import DAO.PessoaDAO;
import Model.Pessoa;
import Model.PessoaFisica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class PessoaDAOMySQL implements PessoaDAO {

    private final Connection conexao;

    public PessoaDAOMySQL(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void inserirPessoa(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (id, nome, documento, tipo) VALUES (?, ?, ?, CAST(? as tipo_pessoa))";
        String tipoPessoa = (pessoa instanceof PessoaFisica) ? "PF" : "PJ";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, pessoa.getId());
            stm.setString(2, pessoa.getNome());
            stm.setString(3, pessoa.getDocumento());
            stm.setString(4, tipoPessoa);

            stm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public Pessoa obterPessoaID(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
