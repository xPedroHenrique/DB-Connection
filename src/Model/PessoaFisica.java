package Model;

import java.util.UUID;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
        this.cpf = cpf;
    }

    public PessoaFisica(UUID id, String nome, String cpf) {
        super(id, nome, cpf);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean validaDocumento(String documento) {
        return true;
    }

}
