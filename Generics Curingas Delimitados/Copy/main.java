import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>();
        List<Object> objetos = new ArrayList<>();

        copiar(numbers);
        copiar(objetos);

        System.out.println(numbers);
        System.out.println(objetos);

    }
    public static void copiar(List<? super Integer> origem) {
        origem.add(10);
        origem.add(20);
        origem.add(30);
    }
}
