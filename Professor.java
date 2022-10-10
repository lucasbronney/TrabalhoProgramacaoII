package trabalho01;

public class Professor extends Funcionario implements PessoaFisica {

    String especialidade;

    // Construtor //

    public Professor(String especialidade, String cpf, String nome, int conta) {
        super(cpf, nome, conta);
        this.especialidade = especialidade;
        this.setFuncao("Professor");
    }


    // Getter and Setter //
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    // Métodos //

    public void status() {
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Funcao: " + this.getFuncao());
        System.out.println("Nome:  " + this.getNome());

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
