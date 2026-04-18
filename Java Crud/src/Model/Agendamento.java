package Model;

public class Agendamento {
    private int id;
    private String nomePaciente;
    private String especialidade; // Alterado de 'descricao'
    private String dataHora;      // Alterado de 'data'

    public Agendamento(int id, String nomePaciente, String especialidade, String dataHora) {
        this.id = id;
        this.nomePaciente = nomePaciente;
        this.especialidade = especialidade;
        this.dataHora = dataHora;
    }

    public int getId() {
        return id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "\n--- DETALHES DO AGENDAMENTO ---" +
                "\nID: " + id +
                "\nPaciente: " + nomePaciente +
                "\nEspecialidade: " + especialidade +
                "\nData/Hora: " + dataHora +
                "\n-----------------------------------";
    }
}
