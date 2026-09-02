public class Livro {

    private Long  id;
    private String titulo;
    private double preco;
    private boolean disponivel;

    public Livro(Long id, String titulo, double preco, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro " +
                " | ID: " + id +
                " | Titulo: " + titulo +
                " | Preço: " + preco +
                " | Disponivel: " + disponivel;
    }
}
