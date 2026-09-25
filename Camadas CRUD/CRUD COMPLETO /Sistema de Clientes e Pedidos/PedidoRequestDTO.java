public record PedidoRequestDTO(
        String descricao,
        double valor,
        Long cliente
) {
}