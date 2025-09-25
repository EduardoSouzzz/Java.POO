import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();

        try {
            int div = n1 / n2;
            System.out.println("Resultado: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        }


    }
}
