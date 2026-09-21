void main() {

    Service service = new Service();

    ProdutoRequestDTO dto1 = new ProdutoRequestDTO("Notebook", 3500.00, 10);
    ProdutoRequestDTO dto2 = new ProdutoRequestDTO("Mouse", 80.00, 20);
    ProdutoRequestDTO dto3 = new ProdutoRequestDTO("Teclado", 150.00, 5);

    ProdutoResponseDTO produto1 = service.cadastrar(dto1);
    ProdutoResponseDTO produto2 = service.cadastrar(dto2);
    ProdutoResponseDTO produto3 = service.cadastrar(dto3);

    System.out.println("=== PRODUTOS CADASTRADOS ===");
    System.out.println(produto1);
    System.out.println(produto2);
    System.out.println(produto3);


    System.out.println("\n=== BUSCANDO PRODUTOS ===");
    System.out.println(service.buscarPorId(produto1.id()));


    System.out.println("\n=== ATUALIZANDO PRODUTO ===");
    ProdutoRequestDTO atualizacao = new ProdutoRequestDTO(
            "Notebook Gamer", 4500.00, 10
    );

    ProdutoResponseDTO produtoAtualizacao = service.atualizar(
            produto1.id(), atualizacao
    );
    System.out.println(produtoAtualizacao);





    System.out.println("\n=== AUMENTANDO ESTOQUE ===");
    ProdutoResponseDTO estoqueAtualizacao = service.aumentarEstoque(
            produto2.id(), 10
    );

    System.out.println(estoqueAtualizacao);

    System.out.println("\n=== VENDENDO PRODUTO ===");

    ProdutoResponseDTO produtoVendido =
            service.venderProduto(produto1.id(), 3);

    System.out.println(produtoVendido);


    // Tentando vender mais unidades do que existem
    System.out.println("\n=== TESTANDO VENDA INVÁLIDA ===");

    try {
        service.venderProduto(produto1.id(), 100);
    } catch (RuntimeException e) {
        System.out.println("Erro: " + e.getMessage());
    }


    // Desativando produto
    System.out.println("\n=== DESATIVANDO PRODUTO ===");

    ProdutoResponseDTO produtoDesativado =
            service.desativarProduto(produto3.id());

    System.out.println(produtoDesativado);


    // Tentando vender um produto desativado
    System.out.println("\n=== TESTANDO VENDA DE PRODUTO DESATIVADO ===");

    try {
        service.venderProduto(produto3.id(), 1);
    } catch (RuntimeException e) {
        System.out.println("Erro: " + e.getMessage());
    }
}
