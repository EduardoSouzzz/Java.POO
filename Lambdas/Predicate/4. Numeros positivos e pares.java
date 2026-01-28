
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> numers = Arrays.asList(-1, -5, -23, -2,
                1, 6, 9, 12, 15, 18, 21, 23, 78, 95, 103);

        Predicate<Integer> numerosPositivos = n -> n > 0;
        Predicate<Integer> numerosPares = n -> n % 2 == 0;

        Predicate<Integer> positivosAndPares =
                numerosPositivos.and(numerosPares);

        numers.stream()
                .filter(positivosAndPares)
                .forEach(System.out::println);
    }
}
