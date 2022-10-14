package trabalho01;

public class Curso {
    // Atributos //

    private String nome, id;
    private int qtdPeriodo;
    // Construtor //

    public Curso(String nome, String id, int qtdPeriodo) {
        this.nome = nome;
        this.id = id;
        this.qtdPeriodo = qtdPeriodo;
    }
    // Getters and Setters //

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQtdPeriodo() {
        return qtdPeriodo;
    }

    public void setQtdPeriodo(int qtdPeriodo) {
        this.qtdPeriodo = qtdPeriodo;
    }
    // Métodos //
    public void infoCurso(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("ID: " + this.getId());
        System.out.println("Quantidade de Periodo: " +this.getQtdPeriodo());
    }
    //toString//

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", id=" + id + ", qtdPeriodo=" + qtdPeriodo + '}';
    }
    
}
