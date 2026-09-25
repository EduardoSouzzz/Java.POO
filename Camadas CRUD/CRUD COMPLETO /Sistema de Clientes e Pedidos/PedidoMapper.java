public class PedidoMapper {

    ClienteMapper clienteMapper = new ClienteMapper();

    public Pedido toEntity(PedidoRequestDTO dto, Cliente cliente) {

        return new Pedido(
                cliente.getId(),
                dto.descricao(),
                dto.valor(),
                cliente,
                true
        );
    }


    public PedidoResponseDTO toDTO(Pedido pedido) {

        ClienteResponseDTO clienteDTO = clienteMapper.toDTO(pedido.getCliente());

        return new PedidoResponseDTO(
                pedido.getId(),
                pedido.getDescricao(),
                pedido.getValor(),
                clienteDTO,
                pedido.isAtivo()
        );
    }
}