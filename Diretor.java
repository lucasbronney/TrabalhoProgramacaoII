package trabalho01;

import java.util.ArrayList;

public class Diretor extends Funcionario implements PessoaFisica, Diretoria {

    // Atributos //

    // Construtor //
    public Diretor(String cpf, String nome, int conta) {
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

    @Override
    public void infoDiretoria() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Funcao: " + this.getFuncao());
        System.out.println("Contas: " + this.getConta());
        System.out.println("Tipo: Pessoa Fisica");
    }

}
