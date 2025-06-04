import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vc vai digitar?: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: " + ( i + 1) + ": " );
            vect[i] = sc.nextInt();
        }

        System.out.println("Números PARES: ");
        for (int i = 0; i < n; i++ ) {
            if (vect[i] % 2 == 0) {
                System.out.println(vect[i]);
            }
        }

        int contPares = 0;

        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                contPares++;
            }
        }
        System.out.println("\nQuantidade de PARES: " + contPares);


        sc.close();
    }
}
