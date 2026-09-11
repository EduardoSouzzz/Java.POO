public class Funcionario {

    private Long id;
    private String nome;
    private boolean ativo;
    private Long idProjeto;

    public Funcionario(Long id, String nome, boolean ativo, Long idProjeto) {
        this.id = id;
        this.nome = nome;
        this.ativo = ativo;
        this.idProjeto = idProjeto;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Long idProjeto) {
        this.idProjeto = idProjeto;
    }

    @Override
    public String toString() {
        return "Funcionario " +
                " | id: " + id +
                " | nome: " + nome +
                " | ativo: " + ativo +
                " | idProjeto: " + idProjeto;
    }
}
