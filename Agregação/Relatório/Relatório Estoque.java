import java.util.ArrayList;
import java.util.List;

public class RelatorioEstoque implements Relatorio{

    private List<Item> itens = new ArrayList<>();

    public RelatorioEstoque() {
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    @Override
    public String gerar() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATORIO DE ESTOQUE === \n");
        sb.append("--------------------------------\n");

        for (Item i : itens) {
            sb.append("Nome: ")
                    .append(i.getNome())
                    .append("\n")
                    .append("Quantidade: ")
                    .append(i.getQuantidade())
                    .append("\n")
                    .append("Preço: ")
                    .append(i.getPreco())
                    .append("\n");
        }
        return sb.toString();
    }
}

