package trabalho01;

public class Faculdade implements PessoaJuridica {

    String nomefantasia, cnpj;
    // Construtor //

    public Faculdade(String nomefantasia, String cnpj) {
        this.nomefantasia = nomefantasia;
        this.cnpj = cnpj;
    }

    // Getters and Setter //
    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Métodos //
    @Override
    public String getCNPJ() {
        return cnpj;
    }

    @Override
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
}
