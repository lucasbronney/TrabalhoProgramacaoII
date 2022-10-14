package trabalho01;

public class Aluno extends Pessoa implements PessoaFisica {
    // Atributos //
    String cpf;
    int matricula;

    // Construtor //

    public Aluno(String cpf, int matricula, String nome, int conta) {
        super(nome, conta);
        this.cpf = cpf;
        this.matricula = matricula;
    }

    // Getters and Setters //
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Métodos //
    @Override
    public String getCPF() {
        return cpf;
    }

    @Override
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno" + "Nome: " + nome + ", CPF: " + cpf + ", Matricula: " + matricula + ", Contas: " + conta + '}';
    }
    
}
