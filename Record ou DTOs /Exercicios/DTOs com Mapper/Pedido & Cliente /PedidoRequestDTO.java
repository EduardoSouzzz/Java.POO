public record PedidoRequestDTO(
        double valor,
        String status,
        Long idCliente,
        String nome
) {
}
