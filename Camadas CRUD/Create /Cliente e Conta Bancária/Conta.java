public class Conta {

    private Long id;
    private String numero;
    private double saldo;
    private boolean ativa;

    public Conta(Long id, String numero, double saldo, boolean ativa) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return "Conta " +
                " | ID: " + id +
                " | Numero: " + numero +
                " | Saldo: " + saldo +
                " | Ativa: " + ativa;
    }
}
