import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Box<String>> boxes = new ArrayList<>();

        System.out.print("Digite quantos nomes vc vai add: ");
        int names = sc.nextInt();

        for (int i = 1; i <= names; i++) {
            System.out.print("Digite o nome " + i + ": ");
            String name = sc.next();

            Box<String> box = new Box<String>(name);
            boxes.add(box);
        }
        System.out.println("Nomes cadastrados com sucesso!");
        for (Box<String> b : boxes) {
            System.out.println(b.getValue());
        }
        sc.close();
    }
}
