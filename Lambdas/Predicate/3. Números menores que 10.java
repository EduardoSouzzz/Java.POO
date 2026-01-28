
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> numeros = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 11, 13, 15, 20, 34)
        );

        Predicate<Integer> integerPredicate = n -> n < 10;
        numeros.removeIf(integerPredicate);
        System.out.println(numeros);
        
    }
}
