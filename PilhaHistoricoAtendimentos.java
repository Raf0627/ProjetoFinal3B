package ProjetoFinal;

import java.util.Stack;

public class PilhaHistoricoAtendimentos {
    private Stack <Paciente> pilha = new Stack<>();

    public void adicionarAoHistorico(Paciente p) {
        pilha.push(p);
    }

    public Paciente verUltimoAtendido() {
        return pilha.peek();
    }

    public void mostrarHistorico() {
        System.out.println("\n--- Histórico de Atendimentos ---");
        if (pilha.isEmpty()) {
            System.out.println("Nenhum atendimento no histórico.");
        } else {
            for (Integer i = pilha.size() - 1; i >= 0; i--) {
                Paciente p = pilha.get(i);
                System.out.println(p.exibirInfo());
            }
        }
    }

}
