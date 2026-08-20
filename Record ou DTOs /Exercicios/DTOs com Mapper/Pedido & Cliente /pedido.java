public class Pedido {

    private Long idPedido;
    private double valor;
    private String status;
    private Cliente cliente;

    public Pedido(Long idPedido, double valor, String status, Cliente cliente) {
        this.idPedido = idPedido;
        this.valor = valor;
        this.status = status;
        this.cliente = cliente;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
