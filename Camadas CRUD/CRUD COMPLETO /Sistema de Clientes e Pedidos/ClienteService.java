import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    ClienteMapper mapper = new ClienteMapper();
    List<Cliente> clientes = new ArrayList<>();
    Long contadorId = 1L;

    public ClienteResponseDTO cadastrar(ClienteRequestDTO dto) {

        if (dto == null) {
            throw new IllegalArgumentException("Cliente é nulo.");
        }

        if (dto.nome() == null || dto.nome().isBlank()) {
            throw new IllegalArgumentException("Nome do cliente são obrigatórios.");
        }

        if (dto.email() == null || dto.email().isBlank()) {
            throw new IllegalArgumentException("Email do cliente são obrigatórios.");
        }
        Cliente cliente = mapper.toEntity(dto);
        cliente.setId(contadorId++);
        clientes.add(cliente);

        return mapper.toDTO(cliente);
    }


    public Cliente buscarPorId(Long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        throw new IllegalArgumentException("Cliente não encontrado.");
    }


    public List<ClienteResponseDTO> listaClientes() {
        List<ClienteResponseDTO> listDTO = new ArrayList<>();

        for (Cliente cliente : clientes) {
            listDTO.add(mapper.toDTO(cliente));
        }
        return listDTO;
    }


    public ClienteResponseDTO desativar(Long id) {

        Cliente cliente = buscarPorId(id);

        if (!cliente.isAtivo()) {
            throw new IllegalArgumentException("Cliente não pode ser desativado, pois ele já está desativado.");
        }
        cliente.setAtivo(false);
        return mapper.toDTO(cliente);
    }
}