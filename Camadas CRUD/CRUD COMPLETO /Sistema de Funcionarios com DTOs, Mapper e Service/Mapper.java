public class Mapper {

    public Funcionario toEntity(FuncionarioRequestDTO dto) {

        return new Funcionario(
                null,
                dto.nome(),
                dto.cargo(),
                dto.salario(),
                true
        );
    }

    public FuncionarioResponseDTO toDTO(Funcionario funcionario) {
        return new FuncionarioResponseDTO(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getCargo(),
                funcionario.getSalario(),
                funcionario.isAtivo()
        );
    }
}
