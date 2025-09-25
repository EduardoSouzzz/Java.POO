import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        try {
            int n = sc.nextInt();
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, digite apenas números.");
        } finally {
            System.out.println("fim da execução.");
        }
        sc.close();
    }
}
