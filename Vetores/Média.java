import java.util.Scanner;

public class MinhaClass_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vc vai digitar?: ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int soma = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
            soma += vect[i];
        }

        int media = ( int ) soma / n;

        System.out.println("MEDIA DO VETOR = " + media);

        for (int i = 0; i < n; i++) {
            if (vect[i] < media ) {
                System.out.println("NÚMEROS ABAIXO DA MÉDIA: ");
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
