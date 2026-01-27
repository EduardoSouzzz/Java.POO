
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws Exception {

        List<String> palavra = new ArrayList<>(Arrays.asList("Java"));

        Predicate<String> palvr = p -> p == null;
        palavra.removeIf(palvr);
        System.out.println(palavra);

    }
}
