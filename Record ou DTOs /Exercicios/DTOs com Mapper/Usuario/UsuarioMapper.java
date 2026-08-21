
public class UsuarioMapper {

    public Usuario toEntity(UsuarioRequestDTO dto) {
        return new Usuario(
                null,
                dto.nome(),
                dto.email(),
                dto.senha(),
                dto.cpf(),
                dto.idade()
        );
    }

    public UsuarioResponseDTO toDTO(Usuario u) {
        return new UsuarioResponseDTO(
                u.getId(),
                u.getNome(),
                u.getEmail(),
                u.getIdade(),
                u.isAtivo()
        );
    }
}
