public class Mapper {

    public Produto toEntity(ProdutoRequestDTO dto) {

        return new Produto(
                null,
                dto.nome(),
                dto.preco(),
                dto.estoque(),
                true
        );
    }

    public ProdutoResponseDTO toDTO(Produto produto) {

        return new ProdutoResponseDTO(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                produto.getEstoque(),
                produto.isAtivo()
        );
    }
}
