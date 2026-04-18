package Main;
import Repository.RepositorioAgendamento;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        RepositorioAgendamento repo = new RepositorioAgendamento();

        while (true) {
            // Título adaptado ao contexto da UPE
            System.out.println("\n🏥 CENTRAL INTELIGENTE DE TELEAGENDAMENTO UPE 🏥");
            System.out.println("1 - Novo Agendamento");
            System.out.println("2 - Listar Agendamentos");
            System.out.println("3 - Atualizar/Reagendar"); // Opção ajustada
            System.out.println("4 - Cancelar Agendamento"); // Opção ajustada
            System.out.println("0 - Sair ");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine(); // limpar buffer

            int id = 0;
            if (opcao == 1) {
                System.out.print("Nome do Paciente: "); // Cliente -> Paciente
                String nome = scan.nextLine();

                System.out.print("Especialidade (Ex: Cardiologia, Pediatria): "); // Descrição -> Especialidade
                String especialidade = scan.nextLine();

                System.out.print("Data e Hora do Agendamento (ex: 15/11/2025 10:30): "); // Data -> Data e Hora
                String dataHora = scan.nextLine();

                repo.adicionarAgendamento(nome, especialidade, dataHora); // Nomes de variáveis atualizados no método
            } else if (opcao == 2) {
                repo.listarAgendamentos();
            } else if (opcao == 3) {
                System.out.println("ID do agendamento a ser atualizado/reagendado:");
                id = scan.nextInt();
                scan.nextLine();

                System.out.print("Novo nome do paciente: "); // Cliente -> Paciente
                String novoN = scan.nextLine();
                System.out.print("Nova Especialidade: "); // Descrição -> Especialidade
                String novaEsp = scan.nextLine();
                System.out.print("Nova Data e Hora: "); // Data -> Data e Hora
                String novaDaH = scan.nextLine();

                repo.atualizarAgendamento(id, novoN, novaEsp, novaDaH); // Nomes de variáveis atualizados no método
            } else if (opcao == 4) {
                System.out.print("ID do agendamento a ser cancelado: "); // Opção ajustada
                repo.removerAgendamento(scan.nextInt());

            } else if (opcao == 0) {
                System.out.println("Encerrando a Central de Teleagendamento.");
                break;
            } else {
                System.out.println("Opção inválida! Escolha um número de 0 a 4.");
            }
        }

        scan.close();
    }
}

