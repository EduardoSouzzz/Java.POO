void main(String[] args) {

    ClienteService clienteService = new ClienteService();
    PedidoService pedidoService = new PedidoService(clienteService);

    ClienteRequestDTO dto1 = new ClienteRequestDTO("Zé", "ze1910@gmail.com");
    ClienteRequestDTO dto2 = new ClienteRequestDTO("Carlos", "carlos20@gmail.com");

    ClienteResponseDTO cliente1 = clienteService.cadastrar(dto1);
    ClienteResponseDTO cliente2 = clienteService.cadastrar(dto2);


    PedidoRequestDTO request1 = new PedidoRequestDTO(
            "Mouse-Pad, 50cm X 25cm",
            49.99,
            cliente1.id()
    );

    PedidoRequestDTO request2 = new PedidoRequestDTO(
            "Placa de Vídeo",
            750.59,
            cliente1.id()
    );

    PedidoRequestDTO request3 = new PedidoRequestDTO(
            "Monitor AOC 27 Polegadas",
            675.00,
            cliente2.id()
    );

    PedidoResponseDTO pedido1 = pedidoService.cadastrar(cliente1.id(), request1);
    PedidoResponseDTO pedido2 = pedidoService.cadastrar(cliente1.id(), request2);
    PedidoResponseDTO pedido3 = pedidoService.cadastrar(cliente2.id(), request3);


    System.out.println("PEDIDOS: ");
    System.out.println(pedido1);
    System.out.println(pedido2);
    System.out.println(pedido3);

    System.out.println("\n BUSCAR PEDIDO PELO ID: ");
    System.out.println(pedidoService.buscarPorId(pedido1.id()));

    System.out.println("\n LISTANDO PEDIDOS DE UM CLIENTE: ");
    System.out.println(pedidoService.listarPorCliente(cliente2.id()));

    System.out.println("\n ATUALIZANDO UM PEDIDO: ");

    PedidoRequestDTO atualizar = new PedidoRequestDTO("Teclado 60% TARGET", 120.99, cliente2.id());
    PedidoResponseDTO pedidoAtualizado = pedidoService.atualizar(pedido2.id(), cliente2.id(), atualizar);
    System.out.println(pedidoAtualizado);

    System.out.println("\n DESATIVANDO CLIENTE: ");
    System.out.println(clienteService.desativar(cliente2.id()));

    System.out.println("\n DESATIVANDO PEDIDO: ");
    System.out.println(pedidoService.desativar(pedido2.id()));

    System.out.println("\n TENTANDO CADASTRAR PEDIDO PARA CLIENTE INATIVO: ");
    try {
        pedidoService.cadastrar(cliente2.id(), atualizar);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}