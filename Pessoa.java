package trabalho01;

public abstract class Pessoa {

    String nome;
    int conta;
    
    // Construtor // 

    public Pessoa(String nome, int conta) {
        this.nome = nome;
        this.conta = conta;
    }

    // Getter and Setter //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
   
}
