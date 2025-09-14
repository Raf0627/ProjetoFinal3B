package ProjetoFinal;

import java.util.Scanner;

public class GerenciadorClinica {

    public static Integer menu(Scanner leitor) {
        System.out.println("===================================================\n" +
                "\n" +
                "1.Adicionar novo paciente à fila\n" +
                "2.Atender próximo paciente\n" +
                "3.Exibir fila de atendimento\n" +
                "4.Exibir histórico de atendimentos\n" +
                "5.Sair\n" +
                "===================================================\n");
        Integer seletor = leitor.nextInt();
        return seletor;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        FilaDeAtendimento fila = new FilaDeAtendimento();
        PilhaHistoricoAtendimentos pilha = new PilhaHistoricoAtendimentos();
        Integer seletor;
        do {
            seletor = menu(leitor);
            if (seletor == 1) {
                System.out.print("Nome do paciente: ");
                leitor.nextLine();
                String nome = leitor.nextLine();
                System.out.print("Idade do paciente: ");
                while (!leitor.hasNextInt()) {
                    System.out.println("Idade inválida. Digite um número.");
                    System.out.print("Idade do paciente: ");
                    leitor.nextLine();
                }
                Integer idade = leitor.nextInt();
                leitor.nextLine();

                System.out.print("Sintoma: ");
                String sintoma = leitor.nextLine();

                Paciente novoPaciente = new Paciente(nome, idade, sintoma);
                fila.adicionarPaciente(novoPaciente);
                System.out.println("Paciente adicionado à fila!");

            } else if (seletor == 2) {
                Paciente pacienteAtendido = fila.atenderPaciente();
                if (pacienteAtendido == null) {
                    System.out.println("Não há pacientes na fila.");
                } else {
                    pilha.adicionarAoHistorico(pacienteAtendido);
                    System.out.println("Paciente atendido: " + pacienteAtendido.exibirInfo());
                }

            } else if (seletor == 3) {
                fila.mostrarFila();

            } else if (seletor == 4) {
                pilha.mostrarHistorico();

            }  else if (seletor == 5) {
                System.out.println("Finalizado");
            }
        } while(seletor!=5);
    }
}
