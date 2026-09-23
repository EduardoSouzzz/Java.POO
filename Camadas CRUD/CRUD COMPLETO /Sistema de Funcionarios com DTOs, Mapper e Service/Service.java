
import java.util.ArrayList;
import java.util.List;

public class Service {

    Mapper mapper = new Mapper();
    List<Funcionario> funcionarios = new ArrayList<>();
    Long contador = 1L;


    public FuncionarioResponseDTO cadastrar(FuncionarioRequestDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("Erro ao cadastrar");
        }

        if (dto.nome() == null || dto.nome().isEmpty()) {
            throw new IllegalArgumentException("Erro ao cadastrar - Nome é nulo ou vazio");
        }

        if (dto.cargo() == null || dto.cargo().isEmpty()) {
            throw new IllegalArgumentException("Erro ao cadastrar - Cargo é nulo ou vazio");
        }

        if (dto.salario() <= 0) {
            throw new IllegalArgumentException("Erro ao cadastrar - Salario é menor que zero");
        }
        Funcionario funcionario = mapper.toEntity(dto);
        funcionario.setId(contador++);
        funcionarios.add(funcionario);

        return mapper.toDTO(funcionario);
    }


    public Funcionario buscarPorId(Long id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                return funcionario;
            }
        }
        throw new IllegalArgumentException("Erro ao buscar o funcionario");
    }


    public FuncionarioResponseDTO atualizar(Long id, FuncionarioRequestDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("Erro ao atualizar");
        }
        if (dto.nome() == null || dto.nome().isBlank()) {
            throw new IllegalArgumentException("Erro ao cadastrar - Nome é nulo ou vazio");
        }

        if (dto.cargo() == null || dto.cargo().isBlank()) {
            throw new IllegalArgumentException("Erro ao cadastrar - Cargo é nulo ou vazio");
        }

        if (dto.salario() <= 0) {
            throw new IllegalArgumentException("Erro ao cadastrar - Salario é menor que zero");
        }
        Funcionario funcionario = buscarPorId(id);
        funcionario.setNome(dto.nome());
        funcionario.setCargo(dto.cargo());
        funcionario.setSalario(dto.salario());

        return mapper.toDTO(funcionario);

    }

    public FuncionarioResponseDTO aumentarSalario(Long id, double percentual) {

        Funcionario funcionario = buscarPorId(id);

        if (percentual <= 0) {
            throw new IllegalArgumentException("Erro ao aumentar Salario");
        }

        if (!funcionario.isAtivo()) {
            throw new IllegalArgumentException("Erro ao aumentar Salario - Funcionario inativo");
        }

        double novoSalario = funcionario.getSalario() + (funcionario.getSalario() * percentual / 100);
        funcionario.setSalario(novoSalario);
        return mapper.toDTO(funcionario);
    }



    public FuncionarioResponseDTO desativar(Long id) {
        Funcionario funcionario = buscarPorId(id);

        if (!funcionario.isAtivo()) {
            throw new IllegalArgumentException("Erro ao desativar - funcionario já está inativo");
        }
        funcionario.setAtivo(false);
        return mapper.toDTO(funcionario);
    }


    public List<FuncionarioResponseDTO> listarFuncionarios() {
        List<FuncionarioResponseDTO> listDTO = new ArrayList<>();

        for (Funcionario funcionario : funcionarios) {
            listDTO.add(mapper.toDTO(funcionario));
        }
        return listDTO;
    }
}

