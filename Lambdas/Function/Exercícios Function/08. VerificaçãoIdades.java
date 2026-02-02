
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> idades = Arrays.asList(10, 15, 22, 8, 30);

        Function<Integer, String> classificar = idade -> {
            if (idade < 12) return "criança";
            if (idade <= 17) return "adolescente";
            return "adulto";
        };
        
        List<String> resultado = idades.stream()
                .map(classificar)
                .toList();
        System.out.println(resultado);


    }
}
