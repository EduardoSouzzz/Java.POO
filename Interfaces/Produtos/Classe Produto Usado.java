import java.time.LocalDate;

public class ProdutoUsado extends Produto implements Etiquetavel{

    private LocalDate dataFabricacao;

    public ProdutoUsado(String nome, double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String gerarEtiqueta() {
        return "=== ETIQUETA PRODUTO USADO ===\n" +
                "Nome: " + getNome() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "Data De Fabricação: " + dataFabricacao + "\n" +
                "==========================";
    }
}
