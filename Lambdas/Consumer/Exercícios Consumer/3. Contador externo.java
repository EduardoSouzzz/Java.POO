
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> num = Arrays.asList(3);

        final int numero = 5;
        Consumer<Integer> integerConsumer = n -> System.out.println(n + numero);
        num.forEach(integerConsumer);
    }
}
