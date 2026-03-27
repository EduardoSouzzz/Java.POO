import java.util.*;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> agenda = new HashMap<>();

        agenda.put("Java", "(11) 98792-2145");
        agenda.put("Spring", "(19) 97654-8909");
        agenda.put("PostgreSQL", "(19) 94312-8949");
        agenda.put("MySQL", "(11) 95912-2587");

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        if (agenda.containsKey(nome)) {
            System.out.println("Contato encontrado!" +
                    " Número do contato: " + agenda.get(nome));
        } else {
            System.out.println("Contato NÃO encontrado.");
        }
        sc.close();
    }
}
