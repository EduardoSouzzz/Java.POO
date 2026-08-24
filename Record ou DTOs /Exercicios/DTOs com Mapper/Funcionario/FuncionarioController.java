public class FuncionarioController {

    private FuncionarioService service =  new FuncionarioService();

    public FuncionarioResponseDTO cadastrar(FuncionarioRequestDTO dto) {
        return  service.cadastrarFuncionario(dto);
    }
}
