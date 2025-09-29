import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        Conta c = new Conta(saldo);

        System.out.print("Digite o valor de saque: ");
        double saque = sc.nextDouble();

        try {
            c.sacar(saque);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
