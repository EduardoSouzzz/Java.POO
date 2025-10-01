import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");

        try {
            double temp = sc.nextDouble();
            System.out.println("Temperatura digitada: " + temp + " C");
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Digite um número.");
        } finally {
            System.out.println("Programa finalizado");
        }
        sc.close();
    }
}
