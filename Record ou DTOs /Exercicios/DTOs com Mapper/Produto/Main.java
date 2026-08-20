void main() {

    ProdutoRequestDTO requestDTO = new ProdutoRequestDTO(
            "Teclado",
            43.90,
            45,
            "Hardware"
    );

    ProdutoMapper mapper = new ProdutoMapper();
    Produto produto = mapper.toEntity(requestDTO);

    ProdutoResponseDTO responseDTO = mapper.toDTO(produto);
    System.out.println(responseDTO);

}
