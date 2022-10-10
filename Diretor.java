package trabalho01;

import java.util.ArrayList;

public class Diretor extends Funcionario implements PessoaFisica, Diretoria {

    // Atributos //
    public static ArrayList<Disciplina> disciplinas = new ArrayList<>();

    // Construtor //
    public Diretor(String cpf, String nome, int conta) {
        super(cpf, nome, conta);
        this.setFuncao("Diretor");
    }

    // Getter and Setter //
    public static ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public static void add(Disciplina d) {
        disciplinas.add(d);
        System.out.println("Disciplina adicinada com sucesso. ");
    }
    // Métodos //    
    public static void listarDisciplinas(){
        System.out.println("Alunos adicionados: \n"+ disciplinas);
    }
    
    public static void rmvDisciplina (Disciplina d){
        disciplinas.remove(d);
        System.out.println("Disciplina removida com sucesso.");
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
