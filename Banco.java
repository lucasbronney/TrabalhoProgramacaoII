package trabalho01;

public class Banco implements PessoaJuridica {
    // Atributos //

    String nome, nomefantasia, cnpj;

    public Banco(String nome, String nomefantasia, String cnpj){
        this.nome = nome;
        this.nomefantasia = nomefantasia;
        this.cnpj = cnpj;
    }

    // Getters and Setters //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
