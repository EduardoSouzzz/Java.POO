import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> nomes = new HashSet<>();

        System.out.print("Digite quantos nomes você vai cadastrar: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            String names = sc.next();
            nomes.add(names);
        }
        System.out.println("Nomes unicos digitado: " + nomes.size());
        
        sc.close();
    }
}
