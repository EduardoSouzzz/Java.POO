
void main() {

    Scanner sc = new Scanner(System.in);

    List<Produto> produtos = List.of(
            new Produto(435L, "Tinta-Spray", 20.00, "Tintas", true),
            new Produto(279L, "Gabinete", 110.00, "Gamers e variados", false),
            new Produto(21L, "Caderno", 25.50, "Trabalho/Escola", true),
            new Produto(60L, "Placa de vídeo", 758.99, "Gamers e variados", true)
    );

    List<Produto> produtosEmEstoque = produtos.stream()
            .filter(u -> u.isEmEstoque())
            .toList();

     System.out.println("Produtos em ESTOQUE: " + produtosEmEstoque);


    List<Produto> produtosAcimaDe100 = produtos.stream()
            .filter(u -> u.getPreco() > 100.00)
            .toList();
    System.out.println("Produtos com valor acima de 100: " + produtosAcimaDe100);


    List<String> nomesFiltrados = produtos.stream()
            .filter(p -> p.isEmEstoque())
            .map(Produto::getNome)
            .toList();
    System.out.println(nomesFiltrados);
}
