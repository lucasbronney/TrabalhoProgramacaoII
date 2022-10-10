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
    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    private String getSala() {
        return sala;
    }

    private void setSala(String sala) {
        this.sala = sala;
    }

    private double getHoraInicio() {
        return horaInicio;
    }

    private void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }

    private double getHoraFim() {
        return horaFim;
    }

    private void setHoraFim(double horaFim) {
        this.horaFim = horaFim;
    }

    // toString //

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", id=" + id + ", sala=" + sala + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + '}';
    }
    
}
