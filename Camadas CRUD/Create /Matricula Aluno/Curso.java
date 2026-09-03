public class Curso {

    private Long id;
    private String nome;
    private double preco;
    private int vagas;
    private boolean ativo;

    public Curso(Long id, String nome, double preco, int vagas, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.vagas = vagas;
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

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Curso " +
                " | id: " + id +
                " | nome: " + nome +
                " | preco: " + preco +
                " | vagas: " + vagas +
                " | ativo: " + ativo;
    }
}
