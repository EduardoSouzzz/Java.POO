public class ProdutoMapper {

    public Produto toEntity(ProdutoRequestDTO dto){
        return new Produto(
                null,
                dto.nome(),
                dto.preco(),
                dto.estoque(),
                dto.categoria()
        );
    }

    public ProdutoResponseDTO toDTO(Produto produto){
        return new ProdutoResponseDTO(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                produto.getCategoria()
        );
    }
}
