public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void sacar(double valor) {
        if (saldo < valor) {
            throw new SaldoInsuficienteException("ERRO, Saldo é menor que o valor.");
        } else {
            double sub = (saldo - valor);
            System.out.println("SUCESSO!");
            System.out.println("Novo Saldo: " + sub);

        }
    }
}
