void main() {

    PedidoRequestDTO requestDTO = new PedidoRequestDTO(
            1490.00,
            "Ativo",
            null,
            "Zé"
    );

    PedidoMapper mapper = new PedidoMapper();
    Pedido pedido = mapper.toEntity(requestDTO);

    PedidoResponseDTO responseDTO = mapper.toDTO(pedido);
    System.out.println(responseDTO);
}
