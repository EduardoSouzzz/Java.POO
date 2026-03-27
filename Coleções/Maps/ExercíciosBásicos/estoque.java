import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        
        Map<String, Double> estoque = new LinkedHashMap<>();
        estoque.put("Arroz", 15.00);
        estoque.put("Refri", 10.00);
        estoque.put("Feijao", 8.00);
        estoque.put("Pao", 4.50);

        for (Map.Entry<String, Double> entry : estoque.entrySet()) {
            if (entry.getValue() > 50.00) {
                System.out.println(entry.getKey() +  "R$ " + entry.getValue());
            }
        }

    }
}
