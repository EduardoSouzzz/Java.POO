public class Pedido {

    private Long id;
    private Long idCliente;
    private Long idProduto;
    private int quantidade;
    private double valorTotal;
    private Status status;

    public Pedido() {

    }

    public Pedido(Long id, Long idCliente, Long idProduto, int quantidade, double valorTotal, Status status) {
        this.id = id;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
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
        return "Pedido " +
                " | id: " + id +
                " | idCliente: " + idCliente +
                " | idProduto: " + idProduto +
                " | quantidade: " + quantidade +
                " | valorTotal: " + valorTotal +
                " | status: " + status;
    }
}
