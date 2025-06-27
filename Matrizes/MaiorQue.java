import java.util.Scanner;

public class MC12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > x) {
                    System.out.println("Maior que " + x + ": " + mat[i][j] + " (Linha  " +
                            i + ", Coluna " + j + " )");
                }
            }
        }
        sc.close();
    }
}
