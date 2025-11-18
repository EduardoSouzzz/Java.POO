import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        System.out.println("C = Cartão de Débito");
        System.out.println("P = PIX");
        System.out.println("B = Boleto");
        System.out.println();
        System.out.print("Qual o método de pagamento?: ");
        char metodo = sc.next().charAt(0);

        sc.nextLine();

        if (metodo == 'C') {
            System.out.print("Digite o Titular do cartão: ");
            sc.nextLine();
            String titular = sc.nextLine();

            System.out.print("Digite o número do cartão: ");
            int numero = sc.nextInt();

            System.out.print("Digite a validade do cartão em MÊS: ");
            sc.nextLine();
            String validade = sc.nextLine();

            System.out.print("Digite o valor a ser pago: ");
            double valor = sc.nextDouble();

            pagamentos.add(new Cartao(numero, titular, validade, valor));


        } else if (metodo == 'P') {
            System.out.print("Digite a Chave PIX:  ");
            int chave = sc.nextInt();

            System.out.print("Digite o valor a ser pago: ");
            double valor = sc.nextDouble();

            System.out.print("Digite o email: ");
            sc.nextLine();
            String email = sc.nextLine();

            System.out.print("Digite o CPF: ");
            int cpf = sc.nextInt();

            pagamentos.add(new Pix(chave, valor, email, cpf));

        } else {
            System.out.print("Codigo de barras");
            String code = sc.nextLine();
            
        }

        for (Pagamento p : pagamentos) {
            System.out.println("Comprovantes: " + p.emitirComprovante());

        }
    }
}
