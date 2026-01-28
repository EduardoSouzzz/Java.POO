
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws Exception {

        List<String> nomes = (
                Arrays.asList("java", "é", "bom", "demais")
        );

        Consumer<String> imprimirNomes = n -> System.out.println(n.toUpperCase());
        nomes.forEach(imprimirNomes);

    }
}
