package trabalho01;

public class Aluno extends Pessoa implements PessoaFisica {
    // Atributos //
    String cpf;
    String matricula;

    // Construtor //

    public Aluno(String cpf, String matricula, String nome, int conta) {
        super(nome, conta);
        this.cpf = cpf;
        this.matricula = matricula;
    }

    // Getters and Setters //
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
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
