package trabalho01;

public class Banco implements PessoaJuridica {
    // Atributos //

    String nome, nomefantasia, cnpj;

    // Construtor //
    public Banco(String nome, String nomefantasia, String cnpj) {
        if (nome.equals("")) {
            try {
                throw new ExceptNome();
            } catch (ExceptNome n) {
                System.out.println("Erro encontrado.");
                n.printStackTrace();
                System.exit(0);
            }
            
        }
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

    public void infoBanco() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nome Fantasia: " + this.getNomefantasia());
        System.out.println("CNPJ: " + this.getCNPJ());
    }
}
