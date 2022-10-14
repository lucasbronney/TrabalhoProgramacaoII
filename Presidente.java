package trabalho01;

import java.util.ArrayList;

public class Presidente extends Funcionario implements PessoaFisica, Diretoria {

    // Construtor //

    public Presidente(String cpf, String nome, int conta) {
        super(cpf, nome, conta);
        this.setFuncao("Presidente");
    }

    // Getters and Setters //

    @Override
    public String getCPF() {
        return cpf;
    }

    @Override
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void infoDiretoria() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Funcao: " + this.getFuncao());
        System.out.println("Contas: " + this.getConta());
        System.out.println("Tipo: Pessoa Fisica");
    }

}
