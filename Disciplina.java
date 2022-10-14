package trabalho01;

public class Disciplina {

    // Atributos // 
    private String nomeDisciplina, idDisciplina,sala;
    private double horaInicio, horaFim;

    // Construtor //

    public Disciplina( String nomeDisciplina, String idDisciplina, String sala, double horaInicio, double horaFim) {
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
        this.sala = sala;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }
    
    // Getters and Setters //
    private String getNomeDisciplina() {
        return nomeDisciplina;
    }

    private void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    private String getIdDisciplina() {
        return idDisciplina;
    }

    private void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
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
        return "Disciplina{" + "nome=" + nomeDisciplina + ", id=" + idDisciplina + ", sala=" + sala + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + '}';
    }
    
}
