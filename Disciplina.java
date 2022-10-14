package trabalho01;

public class Disciplina {

    // Atributos // 
    private String nome,id,sala;
    private double horaInicio, horaFim;
    // Construtor //

    public Disciplina(String nome, String id, String sala, double horaInicio, double horaFim) {
        this.nome = nome;
        this.id = id;
        this.sala = sala;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }
    
    // Getters and Setters //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(double horaFim) {
        this.horaFim = horaFim;
    }

    // toString //

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", id=" + id + ", sala=" + sala + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + '}';
    }
    
}
