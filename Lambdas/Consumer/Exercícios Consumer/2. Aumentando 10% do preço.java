public class Produto {

    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "preco = " + preco;
    }
}


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(12.49));
        produtos.add(new Produto( 5.50));
        produtos.add(new Produto( 8.99));

        Consumer<Produto> aumentarPreco =
                p -> p.setPreco(p.getPreco() * 1.10);
        produtos.forEach(aumentarPreco);
        produtos.forEach(System.out::println);
    }
}
