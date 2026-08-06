public class Produto {

    private Long id;
    private String nome;
    private double preco;
    private String categoria;
    private boolean emEstoque;

    public Produto(Long id, String nome, double preco, String categoria, boolean emEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.emEstoque = emEstoque;
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
        if (preco < 0) {
            throw new IllegalArgumentException("Preço inválido.");
        }
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
    }

    @Override
    public String toString() {
        return "Produto " +
                " Id: " + id +
                " | Nome: " + nome  +
                " | Preco: " + preco +
                " | Categoria: " + categoria +
                " | emEstoque: " + emEstoque + " ||| ";
    }
}
