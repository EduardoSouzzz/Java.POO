public class ContaBancaria {

    private String numeroConta;
    private double saldo;

    public ContaBancaria ( String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar( double valor) {
        this.saldo += valor;
    }

    public void sacar( double valor ) {
        this.saldo -= valor;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}


// classe main;
import java.util.Scanner;

public class MinhaClass_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria("012.678.231-87", 100.00);

        // numero da conta;
        System.out.println("Digite o número da sua conta bancaria: ");
        String numberCont = sc.nextLine();
        cb.setNumeroConta(numberCont);
        System.out.println("Número da conta bancaria: " + cb.getNumeroConta());


        System.out.println();

        // saldo;
        System.out.println("Digite o saldo da conta: ");
        double saldoCont = sc.nextDouble();
        cb.setSaldo(saldoCont);
        System.out.println("Saldo da conta bancaria: " + cb.getSaldo());
        sc.nextLine();

        System.out.println();

        // depositar;
        System.out.println("Deseja depositar? (sim/não): ");
        String depositarNaConta = sc.nextLine();

        if (depositarNaConta.equalsIgnoreCase("sim")) {
            double valorDepositado = sc.nextDouble();
            cb.depositar(valorDepositado);

            System.out.println("Depósito realizado. Saldo atual: " + cb.getSaldo());
            sc.nextLine();

        } else {
            System.out.println("OK, nenhum depósito realizado.");
        }

        System.out.println();

        // sacar;
        System.out.println("Deseja sacar? (sim/não): ");
        String sacarDinheiro = sc.nextLine();

        if (sacarDinheiro.equalsIgnoreCase("sim")) {
            double valorSaque = sc.nextDouble();
            cb.sacar(valorSaque);

            System.out.println("Operação finalizada. Saldo atual: " + cb.getSaldo());

        } else {
            System.out.println("OK, nenhum saque realizado.");
        }

        sc.close();
    }
}
