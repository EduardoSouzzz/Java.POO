import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Produto> produtos = new ArrayList<>();

    public Produto cadastroProduto(Produto produto) {
        produtos.add(produto);
        return produto;
    }
}
