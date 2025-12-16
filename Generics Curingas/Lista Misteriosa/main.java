import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listInt = new ArrayList<>();
        listInt.add(10);

        List<Double> listDouble = new ArrayList<>();
        listDouble.add(55.5);

        imprimirLista(listInt);
        imprimirLista(listDouble);

    }

    public static void imprimirLista(List<?> lista) {
        for (Object object : lista) {
            System.out.println(object);
        }
    }
}
