import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();

        nomes.add("A");
        nomes.add("B");
        nomes.add("C");

        System.out.print("Digite um indice (0, 1 ou 2): ");
        try {
            int indice = sc.nextInt();
            System.out.println("Indice: " + nomes.get(indice));
        } catch (InputMismatchException e) {
            System.out.println("Indice inválido! Digite número inteiro.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice inválido! Tente novamente.");
        } finally {
            System.out.println("Programa Finalizado!");
            sc.close();
        }
    }
}
