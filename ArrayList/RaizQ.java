import java.util.ArrayList;
import java.util.Scanner;

public class MC2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            n.add(i);
        }

        for (int i = 0; i < n.size(); i++) {
            int numero = n.get(i);
            int q = numero * numero;
            System.out.println("Número: " + numero + " | Quadrado: " + q);
        }
        sc.close();
    }
}
