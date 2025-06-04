import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vc vai digitar?: ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero " + ( i + 1) + ": ");
            vect[i] = sc.nextInt();
            soma += vect[i];
        }

        System.out.println("Números Digitados Armazenados: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Valores = " + vect[i]);
        }

        System.out.println();
        double media = ( double) soma / n;

        System.out.println("SOMA = " + soma);
        System.out.println("MÉDIA = " + media);

        sc.close();
    }
}
