public class Quarto {

    private Long id;
    private int numero;
    private double precoDiaria;
    private boolean disponivel;

    public Quarto(Long id, int numero, double precoDiaria, boolean disponivel) {
        this.id = id;
        this.numero = numero;
        this.precoDiaria = precoDiaria;
        this.disponivel = disponivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                ", id: " + id +
                ", numero: " + numero +
                ", precoDiaria: " + precoDiaria +
                ", disponivel: " + disponivel;
    }
}
