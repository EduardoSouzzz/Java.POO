import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    PedidoMapper mapper = new PedidoMapper();
    List<Pedido> pedidos = new ArrayList<>();
    private ClienteService clienteService;

    public PedidoService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public PedidoResponseDTO cadastrar(Long idCliente, PedidoRequestDTO dto) {

        if (dto == null) {
            throw new IllegalArgumentException("ERRO - Pedido é nulo");
        }

        Cliente cliente = clienteService.buscarPorId(idCliente);

        if (dto.descricao() == null || dto.descricao().isEmpty()) {
            throw new IllegalArgumentException("ERRO - Descrição do pedido é obrigatório.");
        }

        if (dto.valor() <= 0) {
            throw new IllegalArgumentException("ERRO - Valor do pedido é zero ou menor que zero.");
        }

        if (!cliente.isAtivo()) {
            throw new IllegalArgumentException("ERRO - Cliente está inativo.");
        }

        Pedido pedido = mapper.toEntity(dto, cliente);
        pedidos.add(pedido);
        return mapper.toDTO(pedido);
    }


    public Pedido buscarPorId(Long idPedido) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId().equals(idPedido)) {
                return pedido;
            }
        }
        throw new IllegalArgumentException("ERRO - Pedido não encontrado.");
    }


    public List<PedidoResponseDTO> listarPorCliente(Long clienteId) {
        List<PedidoResponseDTO> listDTO = new ArrayList<>();

        Cliente cliente = clienteService.buscarPorId(clienteId);

        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().equals(cliente)) {
                listDTO.add(mapper.toDTO(pedido));
            }
        }
        return listDTO;
    }



    public PedidoResponseDTO atualizar(Long idPedido, Long idCliente, PedidoRequestDTO dto) {

        Pedido pedido = buscarPorId(idPedido);
        Cliente cliente = clienteService.buscarPorId(idCliente);

        if (!pedido.isAtivo()) {
            throw new IllegalArgumentException("ERRO - Impossivel atualizar o pedido, pois o pedido é nulo");
        }

        if (dto == null) {
            throw new IllegalArgumentException("ERRO - Pedido é nulo");
        }

        if (dto.descricao() == null || dto.descricao().isEmpty()) {
            throw new IllegalArgumentException("ERRO - Descrição do pedido é obrigatório.");
        }

        if (dto.valor() <= 0) {
            throw new IllegalArgumentException("ERRO - Valor do pedido é zero ou menor que zero.");
        }

        if (!cliente.isAtivo()) {
            throw new IllegalArgumentException("ERRO - Cliente está inativo.");
        }

        pedido.setDescricao(dto.descricao());
        pedido.setValor(dto.valor());
        pedido.setCliente(cliente);
        return mapper.toDTO(pedido);
    }



    public PedidoResponseDTO desativar(Long id) {
        Pedido pedido = buscarPorId(id);

        if (!pedido.isAtivo()) {
            throw new IllegalArgumentException("ERRO - Impossivel desativar o pedido, pois pedido já é inativo.");
        }
        pedido.setAtivo(false);
        return  mapper.toDTO(pedido);
    }
}