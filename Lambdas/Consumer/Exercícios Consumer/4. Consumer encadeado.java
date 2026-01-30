
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws Exception {

        List<String> palavra = new ArrayList<>(Arrays.asList("Tudo"));

        Consumer<String> c1 = s -> System.out.print(s);
        Consumer<String> c2 = s -> System.out.println(" - OK");
        palavra.forEach(c1.andThen(c2));
        
    }
}
