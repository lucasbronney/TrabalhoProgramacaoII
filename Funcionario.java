package trabalho01;

public abstract class Funcionario extends Pessoa {

    String funcao, cpf;
    double salario;
    // Construtor //    

    public Funcionario(String cpf, String nome, int conta) {
        super(nome, conta);
        this.cpf = cpf;
    }
    // Getter and Setter //

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
