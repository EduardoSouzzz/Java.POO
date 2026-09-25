public class Pedido {

    private Long id;
    private String descricao;
    private double valor;
    private Cliente cliente;
    private boolean ativo;

    public Pedido(Long id, String descricao, double valor, Cliente cliente, boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.cliente = cliente;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Pedido " +
                " | id: " + id +
                " | descricao: " + descricao +
                " | valor: " + valor +
                " | cliente: " + cliente +
                " | ativo: " + ativo;
    }
}