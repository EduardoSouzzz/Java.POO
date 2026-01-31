
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {

        Function<String, Integer> converter =
                s -> Integer.parseInt(s);

        Integer resultado = converter.apply("123"); // .apply transforma str em int
        System.out.println(resultado);
    }
}
