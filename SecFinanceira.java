package trabalho01;

public class SecFinanceira extends Funcionario implements PessoaFisica, Secretaria {

    // Construtor //
    public SecFinanceira(String cpf, String nome, int conta) {
        super(cpf, nome, conta);
    }

    // Métodos //
    public void icsSalario(double v) {
        this.setSalario(this.getSalario() + v);
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
