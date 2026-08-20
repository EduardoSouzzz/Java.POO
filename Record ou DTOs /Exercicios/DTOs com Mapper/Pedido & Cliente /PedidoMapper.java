
public class PedidoMapper {

    public Pedido toEntity(PedidoRequestDTO dto) {

        Cliente cliente = new Cliente(
                dto.idCliente(),
                dto.nome()
        );

        return new Pedido(
                null,
                350.00,
                "Ativo",
                cliente
        );
    }

    public PedidoResponseDTO toDTO(Pedido pedido) {
        return new PedidoResponseDTO(
                pedido.getIdPedido(),
                pedido.getValor(),
                pedido.getStatus(),
                pedido.getCliente().getNome()
        );
    }
}
