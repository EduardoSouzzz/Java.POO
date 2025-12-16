import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        List<Number> myNumbers = new ArrayList<>();
        myNumbers.add(5);
        myNumbers.add(6.7);
        myNumbers.add(9.3f);

        System.out.println("Soma dos números: " + somar(myNumbers));

    }
    public static double somar(List<? extends Number> numeros) {
        double sum = 0.0;
        for (Number number : numeros) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
