import java.awt.color.ProfileDataException;
import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private Map<Integer, Produto> produtos = new HashMap<>();

    public void addProduto(Produto p) {
        produtos.put(p.getId(), p);
    }

    public void removerProduto(Integer id) {
        produtos.remove(id);
    }

    public void atualizarQuantidade(Integer id, Integer novaQtd) {
        if (produtos.containsKey(id)) {
            Produto p = produtos.get(id);
            p.setQuantidade(novaQtd);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void listarProdutos() {
        for (Produto p : produtos.values()) {
            System.out.println(
                    "ID: " + p.getId() +
                    " | Nome: " + p.getNome() +
                    " | Quantidade: " + p.getQuantidade()
            );
        }
    }
}
