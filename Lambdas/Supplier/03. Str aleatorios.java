
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        Supplier<String> nome = () -> "Jogador " + (new Random().nextInt(10));
        Stream.generate(nome)
                .limit(5)
                .forEach(System.out::println);
    }
}
