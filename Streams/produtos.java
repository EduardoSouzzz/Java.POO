import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        
        List<Product> products = Arrays.asList(
                new Product("Notebook", 3500.00),
                new Product("Televisao", 2200.00),
                new Product("Geladeria", 850.00)
        );

        products.stream()
                .filter(i -> i.getPreco() > 200)
                .map(i -> i.getNome().toUpperCase() + "- R$ " + i.getPreco())
                .forEach(System.out::println);
    }
}
