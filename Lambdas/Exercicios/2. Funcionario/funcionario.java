import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, String cargo, double salario, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            new IllegalArgumentException("Salário Invalido");
        }
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return " | Funcionario: " +
                " | Nome: " + nome +
                " | Cargo: " + cargo +
                " | Salario: " + salario +
                " | DataAdmissao: " + dataAdmissao;
    }
}
