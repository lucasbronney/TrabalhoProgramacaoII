package trabalho01;

import java.util.ArrayList;

public class Presidente extends Funcionario implements PessoaFisica, Diretoria {

    // Construtor //

    public Presidente( String nome,String cpf, int conta) {
        super(cpf, nome, conta);
        this.setFuncao("Presidente");
    }

    @Override
    public String getCPF() {
        return cpf;
    }

    @Override
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

}
