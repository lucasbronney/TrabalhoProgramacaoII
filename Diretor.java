package trabalho01;

import java.util.ArrayList;

public class Diretor extends Funcionario implements PessoaFisica, Diretoria {

    // Atributos //

    // Construtor //
    public Diretor(String nome, String cpf, int conta) {
        super(cpf, nome, conta);
        this.setFuncao("Diretor");
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
