public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    @Override
    public String toString() {
        return "Nome do produto: " + nome +
                "\nPreço do " + nome + ": " + preco;
    }
}




import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        Supplier<Produto> produtoSupplier = () -> new Produto("Teclado", 120.0);
        System.out.println(produtoSupplier.get());
    }
}
