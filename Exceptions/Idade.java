import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        
        try {
            int idade = sc.nextInt();
            System.out.println("Sua idade é: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Digite um número inteiro para a idade.");
        } finally {
            System.out.println("Obrigado por usar o programa.");
        }
        sc.close();
    }
}
