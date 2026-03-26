import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        
        List<String> emails = Arrays.asList(
                "ana@gmail.com", "bruno@hotmail.com",
                "carlos@gmail.com", "diana@yahoo.com", "eva@gmail.com"
        );

        emails.stream()
                .filter(e -> e.endsWith("@gmail.com"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
