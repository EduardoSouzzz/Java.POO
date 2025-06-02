import java.util.Scanner;

public class MinhaClass_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vc vai digitar?: ");
        int n = sc.nextInt();


        while (n > 10) {
            System.out.println("Você não pode digitar mais que 10 números... tente novamente");
            n = sc.nextInt();
        }

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número " + (i + 1) + ": ");
            vect[i] = sc.nextInt();
        }


        System.out.println("\nNúmeros armazenados: ");
        for (int i = 0; i < n; i++) {
            System.out.println("* " + vect[i]);
        }

        sc.close();


    }
}
