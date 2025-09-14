package ProjetoFinal;


import java.util.LinkedList;

public class FilaDeAtendimento {
    private LinkedList <Paciente> fila = new LinkedList<>();

    public void adicionarPaciente (Paciente p) {
        fila.add(p);
    }

    public Paciente atenderPaciente () {
        return fila.poll();
    }


    public boolean estaVazia () {
        return fila.isEmpty();
    }

    public void mostrarFila() {
        System.out.println("\n--- Fila de Atendimento ---");
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
        } else {
            for (Paciente p : fila) {
                System.out.println(p.exibirInfo());
            }
        }
    }
}
