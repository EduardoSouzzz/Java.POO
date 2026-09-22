public class Curso {

    private Long id;
    private String nome;
    private String instrutor;
    private double cargaHoraria;
    private boolean ativo;

    public Curso(Long id, String nome, String instrutor, double cargaHoraria, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.instrutor = instrutor;
        this.cargaHoraria = cargaHoraria;
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

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
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
                " | instrutor: " + instrutor +
                " | cargaHoraria: " + cargaHoraria +
                " | ativo: " + ativo;
    }
}
