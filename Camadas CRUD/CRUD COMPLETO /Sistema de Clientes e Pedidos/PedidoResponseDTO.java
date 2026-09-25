public record PedidoResponseDTO(

        Long id,
        String descricao,
        double valor,
        ClienteResponseDTO ClienteResponseDTO,
        boolean ativo
) {
}