public class Conta {

    private Long id;
    private String numero;
    private double saldo;
    private boolean ativa;
    private Long idCliente;

    public Conta(Long id, String numero, double saldo, boolean ativa, Long idCliente) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.ativa = ativa;
        this.idCliente = idCliente;
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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Conta " +
                " | id: " + id +
                " | numero: " + numero +
                " | saldo: " + saldo +
                " | ativa: " + ativa +
                " | idCliente: " + idCliente;
    }
}
