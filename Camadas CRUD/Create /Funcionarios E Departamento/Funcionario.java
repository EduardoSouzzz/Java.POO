public class Funcionario {

    private Long id;
    private String nome;
    private double salario;
    private boolean ativo;
    private Long idDepartamento;

    public Funcionario(Long id, String nome, double salario, boolean ativo, Long idDepartamento) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.ativo = ativo;
        this.idDepartamento = idDepartamento;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "Funcionario " +
                " | id: " + id +
                " | nome: " + nome +
                " | salario: " + salario +
                " | ativo: " + ativo +
                " | idDepartamento: " + idDepartamento;
    }
}
