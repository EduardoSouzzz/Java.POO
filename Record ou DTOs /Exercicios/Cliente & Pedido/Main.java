void main() {

    Cliente cliente = new Cliente(56L, "Marcelo");
    Pedido pedido = new Pedido(10L, 250.00, cliente);

    PedidoResponseDTO pedidoDTO = new PedidoResponseDTO(
            pedido.getIdPedido(),
            pedido.getValor(),
            cliente.getNomeCliente()
    );
    System.out.println(pedidoDTO);
}
