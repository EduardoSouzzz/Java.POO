
public class ClienteMapper {

    public Cliente toEntity(ClienteRequestDTO dto) {

        Endereco endereco = new Endereco(
                dto.rua(),
                dto.numero(),
                dto.cidade()
        );

        return new Cliente(
                null,
                dto.nome(),
                dto.email(),
                endereco
        );
    }

    public ClienteResponseDTO toDTO(Cliente c) {
        return new ClienteResponseDTO(
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getEndereco().getCidade()
        );
    }
}
