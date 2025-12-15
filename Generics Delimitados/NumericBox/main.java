import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NumericBox<Integer> boxInt = new NumericBox<>(10);
        NumericBox<Double> boxDouble = new NumericBox<>(5.5);

        System.out.println(boxInt.doubleValue());
        System.out.println(boxDouble.doubleValue());




        sc.close();
    }
}
