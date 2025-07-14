import java.util.Scanner;

public class MC8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 Números: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        System.out.println("Soma dos elementos = " + soma);
    }
}
