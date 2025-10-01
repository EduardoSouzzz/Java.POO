import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int primer = sc.nextInt();

        try {
            System.out.print("Digite outro número: ");
            int second = sc.nextInt();

            int divd = primer / second;
            System.out.println("O resultado é: " + divd);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } finally {
            System.out.println("Programa finalizado!");
        }
        sc.close();
    }
}
