
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws Exception {

       List<Produto> produtos = new ArrayList<>();
       produtos.add(new Produto(25));
       produtos.add(new Produto(34));
       produtos.add(new Produto(150));

       Predicate<Produto> produtoPredicate = p -> p.getPreco() > 100;
       produtos.removeIf(produtoPredicate);

       System.out.println(produtos);


    }
}
