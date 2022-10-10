package trabalho01;

public class SecAcademica extends Funcionario implements PessoaFisica, Secretaria {

    // Construtor //
    public SecAcademica(String cpf, String nome, int conta) {
        super(cpf, nome, conta);
    }

    //Métodos//
    public void ConsultarFrequencia(int faltas) {
        if (faltas >= 5) {
            System.out.println("Atingiu o numero maximo de faltas.");
        } else {
            System.out.println("O limite de faltas permitidas é 5 faltas");
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

}
