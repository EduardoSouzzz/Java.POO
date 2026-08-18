void main() {

    ProdutoRequestDTO requestDTO = new ProdutoRequestDTO(54L, "Perfume", 150.00, 748);
    Produto produto = new Produto(requestDTO.id(), requestDTO.nome(), requestDTO.preco(), requestDTO.estoque());

    ProdutoResponseDTO responseDTO = new ProdutoResponseDTO(produto.getNome(), produto.getPreco());
    System.out.println(responseDTO);
}
