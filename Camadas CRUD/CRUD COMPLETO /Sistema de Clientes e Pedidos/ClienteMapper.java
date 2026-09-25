public class ClienteMapper {

    public Cliente toEntity(ClienteRequestDTO dto) {

        return new Cliente(
                null,
                dto.nome(),
                dto.email(),
                true
        );
    }

    public ClienteResponseDTO toDTO(Cliente cliente) {
        return new ClienteResponseDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.isAtivo()
        );
    }
}