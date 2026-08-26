import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Produto> produtos = new ArrayList<>();
    boolean encontrou = false;

    public void alterarEstoque(Long id, int newQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                encontrou = true;
                if (newQuantidade < 0) {
                    throw new RuntimeException("Estoque negativo");
                }
                produto.setQuantidade(newQuantidade);
            }
        }
        if (!encontrou) {
            throw new RuntimeException("Estoque nao encontrado");
        }
    }
}
