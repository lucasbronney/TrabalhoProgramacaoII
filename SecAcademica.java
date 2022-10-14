package trabalho01;

public class SecAcademica extends Funcionario implements PessoaFisica, Secretaria {

    int h;
    String Curso;

    // Construtor //
    public SecAcademica(String cpf, String nome, int conta) {
        super(cpf, nome, conta);
        this.setFuncao("Secretaria Academica");
    }
    // Getters and Setters//

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    //Métodos//
    public void ConsultarHoras(int horas) {
        if (horas > 610) {
            try {
                throw new ExceptHoras();
            } catch (ExceptHoras h) {
                System.out.println("Numero de horas invalidos");
                h.printStackTrace();
            }
        } else {
            System.out.println("Consultando Horas e Atividades realizadas");
            System.out.println("...");
            System.out.println("..");
            System.out.println(".");
            h = horas - 610;
            System.out.println("Qtdade horas necessarias: 610");
            System.out.println("Qtdade horas obtidas " + horas);
            System.out.println("Horas a realizar " + this.getH());
        }
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
    public void infoSecretaria() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Funcao: " + this.getFuncao());
        System.out.println("Contas: " + this.getConta());
        System.out.println("Tipo: Pessoa Fisica");

    }

}
