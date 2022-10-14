package trabalho01;

import java.util.ArrayList;

public class Coordenador extends Funcionario implements PessoaFisica, Diretoria {


// Construtor //
    public Coordenador(String nome, String cpf, int conta) {
        super(cpf, nome, conta);
        this.setFuncao("Coordenador");
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
