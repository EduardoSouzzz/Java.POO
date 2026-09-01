public class Evento {

    private Long id;
    private String nome;
    private double preco;
    private int ingrDisponiveis;

    public Evento(Long id, String nome, double preco, int ingrDisponiveis) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.ingrDisponiveis = ingrDisponiveis;
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

    public int getIngrDisponiveis() {
        return ingrDisponiveis;
    }

    public void setIngrDisponiveis(int ingrDisponiveis) {
        this.ingrDisponiveis = ingrDisponiveis;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", ingrDisponiveis=" + ingrDisponiveis +
                '}';
    }
}
