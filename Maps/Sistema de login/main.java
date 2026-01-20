
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        System.out.print("Digite a senha: ");
        String password = sc.nextLine();

        SistemaLogin sl = new SistemaLogin();

        sl.register(email, password);
        sl.login(email, password);
        sl.listUsers();
    }
}
