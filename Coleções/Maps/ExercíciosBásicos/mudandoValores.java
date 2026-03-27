import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        
        Map<String, Integer> one = new HashMap<>();
        one.put("a", 1);
        one.put("b", 2);
        one.put("c", 3);

        Map<Integer, String> two = new HashMap<>();
        two.put(1, "a");
        two.put(2, "b");
        two.put(3, "c");

        System.out.println("Map one, valores normais: " + one);
        System.out.println("Map two, valores invertidos: " + two);
    }
}
