public record ProdutoResponseDTO(

        Long id,
        String nome,
        double preco,
        int estoque,
        boolean ativo
) {
}
