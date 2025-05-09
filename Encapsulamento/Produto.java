public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    // preco;
    public double getPreco() {
        return preco;
    }
    public void setPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("Erro: preço inválido (" + novoPreco + "). Deve ser maior que zero.");
        }
    }


    // quantidade;
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // metodo;
    public void exibirInfo() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preco do produto: " + preco);
        System.out.println("Quantidade do produto: " + quantidade);
    }
}
