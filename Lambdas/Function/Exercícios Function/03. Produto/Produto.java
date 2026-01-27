public class Produto {

    private int preco;

    public Produto(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto { preco = " + preco + '}';
    }
}
