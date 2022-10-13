package trabalho01;

public class Gerente extends Funcionario implements PessoaFisica {

    boolean ativo;

    // Construtor //


    public Gerente(String cpf, String nome, int conta) {
        super(cpf, nome, conta);
        this.setFuncao("Gerente");
    }


    // Getters and Setters //
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
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

    public void fecharConta() {
        if (this.isAtivo()) {
            this.setAtivo(false);
            this.setConta(conta -1);
            System.out.println("Conta fechada com sucesso.");
        } else {
            System.out.println("Conta inexistente. ");
        }
    }

    public void abrir() {
        this.setAtivo(true);
        this.setConta(conta +1);
        System.out.println("Conta aberta com sucesso.");

    }
}
