public class Pedido {

    private Long id;
    private String cliente;
    private double valorTotal;
    private Status status;

    public Pedido(Long id, String cliente, double valorTotal, Status status) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Valor não informado, pois é zero");
        }
        this.valorTotal = valorTotal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido" +
                " Id: " + id +
                " | Cliente: " + cliente +
                " | ValorTotal: " + valorTotal +
                " | Status: " + status;
    }
}
