
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> numero = Arrays.asList(5);

        Function<Integer, Integer> dobrar = n -> n * 2;

        List<Integer> resultado = numero.stream()
                .map(dobrar) // aplica function em cada elemento
                .toList(); // recolhe tudo de volta numa lista nova
        System.out.println(resultado);
    }
}
