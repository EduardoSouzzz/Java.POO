
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Function<Integer, Integer> dobrar = n -> n * 2; // dobra os valores
        List<Integer> resultado = numbers.stream()
                .map(dobrar) // map aplica a função em cada elemento
                .toList();
        System.out.println(resultado);
    }
}
