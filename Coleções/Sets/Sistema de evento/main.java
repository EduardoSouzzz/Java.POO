import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> portaA = new HashSet<>();
        Set<Integer> portaB = new HashSet<>();

        // PORTA A
        System.out.print("Quantas pessoas entraram pela porta A? ");
        int qtdA = sc.nextInt();

        for (int i = 1; i <= qtdA; i++) {
            System.out.print("Código do participante " + i + " da porta A: ");
            portaA.add(sc.nextInt());
        }

        System.out.println();
        // PORTA B
        System.out.print("Quantas pessoas entraram pela porta B? ");
        int qtdB = sc.nextInt();

        for (int i = 1; i <= qtdB; i++) {
            System.out.print("Código do participante " + i + " da porta B: ");
            portaB.add(sc.nextInt());
        }

        // União
        Set<Integer> todos = new HashSet<>(portaA);
        todos.addAll(portaB);

        // Interseção
        Set<Integer> ambos = new HashSet<>(portaA);
        ambos.retainAll(portaB);

        // Somente A
        Set<Integer> somenteA = new HashSet<>(portaA);
        somenteA.removeAll(portaB);

        // Somente B
        Set<Integer> somenteB = new HashSet<>(portaB);
        somenteB.removeAll(portaA);

        // RELATÓRIO
        System.out.println("\n--- RELATÓRIO ---");
        System.out.println("Total de participantes: " + todos.size());
        System.out.println("Entraram pelas duas portas: " + ambos);
        System.out.println("Somente porta A: " + somenteA);
        System.out.println("Somente porta B: " + somenteB);

        sc.close();
    }
}
