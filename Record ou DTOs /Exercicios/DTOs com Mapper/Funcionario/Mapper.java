public class FuncionarioMapper {

    public Funcionario toEntity(FuncionarioRequestDTO dto) {
        return new Funcionario(
                null,
                dto.nome(),
                dto.email(),
                dto.salario(),
                dto.cargo(),
                dto.departamento()
        );
    }

    public FuncionarioResponseDTO toDTO(Funcionario f) {
        return new FuncionarioResponseDTO(
                f.getId(),
                f.getNome(),
                f.getCargo(),
                f.getDepartamento()
        );
    }
}
