public class Projeto {

    private Long id;
    private String nome;
    private double orcamento;
    private boolean ativo;

    public Projeto(Long id, String nome, double orcamento, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.orcamento = orcamento;
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

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Projeto " +
                " | id: " + id +
                " | nome: " + nome +
                " | orcamento: " + orcamento +
                " | ativo: " + ativo;
    }
}
