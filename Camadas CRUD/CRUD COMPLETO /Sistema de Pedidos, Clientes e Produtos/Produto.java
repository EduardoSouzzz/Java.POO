public class Produto {

    private Long id;
    private String nome;
    private double preco;
    private int estoque;
    private boolean ativo;

    public Produto(Long id, String nome, double preco, int estoque, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Produto " +
                " | id: " + id +
                " | nome: " + nome +
                " | preco: " + preco +
                " | estoque: " + estoque +
                " | ativo: " + ativo;
    }
}
