import java.util.Scanner;

public class MC12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = sc.nextInt();

        System.out.print("Digite outro número: ");
        int b = sc.nextInt();
        int soma = 0;

        System.out.println();

        int[][] mat = new int[a][b];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int c = 0; c < mat.length; c++) {
            for (int d = 0; d < mat[c].length; d++) {
               soma += mat[c][d];
            }
        }
        System.out.println("SOMA DOS ELEMENTOS: " + soma);
        sc.close();

    }
}
