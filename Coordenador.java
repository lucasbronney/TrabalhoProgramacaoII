package trabalho01;

import java.util.ArrayList;

public class Coordenador extends Funcionario implements PessoaFisica, Diretoria {
// Atributos //
    public static ArrayList<Aluno> alunos = new ArrayList<>();

// Construtor //
    public Coordenador(String cpf, String nome, int conta) {
        super(cpf, nome, conta);
        this.setFuncao("Coordenador");
    }

// Getters and Setters //
    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public static void add(Aluno a) {
        alunos.add(a);
        System.out.println("Aluno adicionado com sucesso! ");
    }

// Métodos //
    public static void listarAlunos() {
        System.out.println("Alunos adicionados: \n" + alunos);
    }

    public static void rmvAluno(Aluno a) {
        alunos.remove(a);
        System.out.println("Aluno removido com sucesso! ");
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
