package Repository;
import Model.Agendamento;
import java.util.ArrayList;
public class RepositorioAgendamento {
    private ArrayList<Agendamento> lista = new ArrayList<>();
    private int contadorId = 1;

    // CREATE (Agendamento)
    public void adicionarAgendamento(String nomePaciente, String especialidade, String dataHora) {
        Agendamento novo = new Agendamento(contadorId, nomePaciente, especialidade, dataHora);
        lista.add(novo);
        contadorId++;
        System.out.println("Agendamento criado com sucesso!");
    }

    // READ (listar todos)
    public void listarAgendamentos() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum agendamento cadastrado!");
            return;
        }
        for (Agendamento a : lista) {
            System.out.println(a);
        }
    }
    //READ (buscar por id)
    public Agendamento buscarPorId(int id) {
        for (Agendamento a : lista) {
            if (a.getId() == id ){
                return a;
            }
        }
        return null;
    }
    //UPDATE (Reagendamento/Alteração)
    public void atualizarAgendamento(int id, String novoNome, String novaEspecialidade, String novaDataHora) {
        Agendamento ag = buscarPorId(id);
        if (ag == null) {
            System.out.println("Agendamento não encontrado!");
            return;
        }

        ag.setNomePaciente(novoNome);
        ag.setEspecialidade(novaEspecialidade);
        ag.setDataHora(novaDataHora);

        System.out.println("Agendamento atualizado com sucesso!");
    }

    // DELETE (Cancelamento)
    public void removerAgendamento(int id) {
        Agendamento ag = buscarPorId(id);

        if (ag == null) {
            System.out.println("Agendamento não encontrado!");
            return;
        }

        lista.remove(ag);
        System.out.println("Agendamento removido com sucesso!");
    }
}
