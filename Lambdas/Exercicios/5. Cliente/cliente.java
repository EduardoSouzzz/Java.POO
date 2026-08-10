public class Cliente {

    private String nome;
    private String cidade;
    private double totalCompras;

    public Cliente(String nome, String cidade, double totalCompras) {
        this.nome = nome;
        this.cidade = cidade;
        this.totalCompras = totalCompras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }

    @Override
    public String toString() {
        return " | Cliente: " +
                " | Nome: " + nome +
                " | Cidade: " + cidade +
                " | TotalCompras: " + totalCompras;
    }
}
