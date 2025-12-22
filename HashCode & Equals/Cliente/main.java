import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente c1 = new Cliente("java", "jv123@gmail.com");
        Cliente c2 = new Cliente("java", "jv123@gmail.com");

        System.out.println(c1.hashCode()); 
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // compara os elementos

        sc.close();
    }
}
