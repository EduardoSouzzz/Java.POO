import java.util.*;

public class Main3 {
    public static void main(String[] args) {
      
        List<Double> precos = Arrays.asList(100.0, 250.0, 80.0, 320.0, 50.0);
        precos.stream()
                .map(p -> p * 0.9)
                .forEach(System.out::println);
    }
}
