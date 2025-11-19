public class ProdutoImportado extends Produto implements Etiquetavel{

    private double taxa;

    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String gerarEtiqueta() {
        return "=== ETIQUETA PRODUTO IMPORTADO ===\n" +
                "Nome: " + getNome() + "\n" +
                "preço: " + getPreco() + "\n" +
                "Taxa: " + taxa + "\n" +
                "==========================";
    }
}
