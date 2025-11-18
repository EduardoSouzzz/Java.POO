import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("E - Email");
        System.out.println("S - SMS");
        System.out.println("P - Push");

        System.out.print("Qual tipo de notificador deseja usar?: ");
        char opc = sc.next().toUpperCase().charAt(0);
        sc.nextLine();


        Notificador n = null;

        if (opc == 'E') {
            System.out.print("Digite seu EMAIL: ");
            String email = sc.nextLine();

            n = new EmailNotificador(email);

        } else if (opc == 'S') {
            System.out.print("Digite seu número de telefone: ");
            String num = sc.nextLine();

            n = new SmsNotificador(num);

        } else if (opc == 'P') {
            System.out.print("Digite o seu token: ");
            String token = sc.nextLine();

            n = new PushNotificador(token);
        }
        ArrayList<Notificador> notificadors = new ArrayList<>();
        notificadors.add(n);

        for (Notificador notificador : notificadors) {
            notificador.enviar("Você tem uma nova mensagem!");
        }


    }
}
