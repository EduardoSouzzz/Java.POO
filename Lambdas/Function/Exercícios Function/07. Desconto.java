
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Double> precos = (Arrays.asList(20.0, 10.0, 45.0, 3.0));

        Function<Double, Double> desconto =
                p -> p - (p * 0.9);

        List<Double> resultado = precos.stream()
                .map(desconto)
                .toList();
        resultado.forEach(v -> System.out.printf("%.2f%n", v));


    }
}
