import java.util.Arrays;
import java.util.Scanner;

public class MC7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vc vai digitar? ");
        int n = sc.nextInt();
        System.out.println(); // Quebra de linha para organizar;
        System.out.println("Digite os " + n + " números: ");

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }

        int[] vect2 = new int[n];

        for (int i = 0; i < vect.length; i++) {
            vect2[i] = vect[i] * 2;
        }

        System.out.println("Original: " + Arrays.toString(vect));
        System.out.println("Dobrado: " + Arrays.toString(vect2));
        
        sc.close();
    }
}
