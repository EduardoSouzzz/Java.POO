import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(maiorElemento(numbers));
    }

    public static <T extends Comparable<T>> T maiorElemento(List<T> lista) {
        T maior = lista.get(0);

        for (T elemento : lista) {
            if (elemento.compareTo(maior) > 0) {
                maior = elemento;
            }
        }
        return maior;
    }
}
