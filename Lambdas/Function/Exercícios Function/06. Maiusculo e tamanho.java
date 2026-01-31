
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {

         Function<String, String> maiusculo =
                 texto -> texto.toUpperCase();

         Function<String, Integer> tamanho =
                 txt -> txt.length();

         Function<String, Integer> resultado =
                 maiusculo.andThen(tamanho);
         System.out.println(resultado.apply("java"));
    }
}
