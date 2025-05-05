public class CurrencyConverter {

    public double dollarPrice;
    public double dollarQuantity;

    public double Conversao() {
        return dollarQuantity * dollarPrice;
    }

    public double Porcentagem() {
        return 0.06 * Conversao();
    }

    public double Reais() {
        return Conversao() + Porcentagem();
    }
}

import java.util.Scanner;

public class MinhaClass_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("What is the dollar price?: ");
        cc.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?: ");
        cc.dollarQuantity = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", cc.Reais());
    }
}
