public class FuncionarioService {

    private final FuncionarioMapper mapper = new FuncionarioMapper();

    public FuncionarioResponseDTO cadastrarFuncionario(FuncionarioRequestDTO dto) {
        Funcionario funcionario = mapper.toEntity(dto);
        funcionario.setId(1L);
        return mapper.toDTO(funcionario);
    }
}
