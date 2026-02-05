
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,2,3,4));

        Set<Integer> integers = new HashSet<>(numbers);

        System.out.println("Lista original: " + numbers);
        System.out.println("Sem repetição: " + integers);

        int repetidos = numbers.size() - integers.size();
        System.out.println("Foram removidos "  + repetidos + " repetidos");

    }
}
