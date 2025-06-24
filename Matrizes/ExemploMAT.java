import java.util.Scanner;

public class MinhaClass_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];


        for (int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");

        for (int i = 0; i<mat.length; i++) {
            System.out.println(mat[i][i] + " ");

        }
        System.out.println();

        int contNegative = 0;

        for (int i = 0; i<n; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    contNegative++;
                }
            }
        }
        System.out.println("Números Negativos: " + contNegative);

        sc.close();
    }
}
