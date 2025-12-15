import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Comparador<Integer> comparadorsInt = new Comparador<>(10, 20);
        Comparador<String> comparadorsStr = new Comparador<>("java", "avaj");

        // maiores valores
        System.out.println("Maior Número: " + comparadorsInt.maior());
        System.out.println("Maior String: " + comparadorsStr.maior());

        // Comparando os dois objetos
        System.out.println("Comparação de números: " + comparadorsInt.compareTo());
        System.out.println("Comparação de strings: " + comparadorsStr.compareTo());


        sc.close();
    }
}
