import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Autenticavel> autenticavels = new ArrayList<>();

        System.out.println("L - Login Local");
        System.out.println("G - Login Google");
        System.out.println("H - Login GitHub");

        System.out.print("Digite a forma de login: ");
        char login = sc.next().toUpperCase().charAt(0);
        sc.nextLine();

        Autenticavel autenticador = null;

        String usuarioDigitado = "Zeze"; // define o usuario do LoginLocal
        String senhaDigitada = "sos"; // define a senha do LoginLocal
        String tokenDigitado = "";

        if (login == 'L') {
            System.out.print("Digite o usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            autenticador = new LoginLocal(usuario, senha);

        } else if (login == 'G') {
            System.out.print("Digite o token do Google: ");
            String tokenG = sc.nextLine();

            autenticador = new LoginGoogle(tokenG);

        } else if (login == 'H') {
            System.out.print("Digite o token do GitHub: ");
            String tokenH = sc.nextLine();

            autenticador = new LoginGitHub(tokenH);

        } else {
            System.out.println("Opção ivalida.");
            return;
        }

        // Guarda a instancia criada
        autenticavels.add(autenticador);

        boolean acesso;

        if (login == 'L') {
            // LoginLocal usa usuário e senha
            acesso = autenticador.autenticar(usuarioDigitado, senhaDigitada);
        } else {
            // Google e GitHub usam token (senhaDigitada = token)
        acesso = autenticador.autenticar("",tokenDigitado);
        }

        System.out.println("\n==============================");
        if (acesso) {
            System.out.println("Acesso permitido! ✔");
        } else {
            System.out.println("Acesso negado! ❌");
        }
        System.out.println("==============================");

        sc.close();
    }
}
