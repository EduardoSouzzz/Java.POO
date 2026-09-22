
import java.util.ArrayList;
import java.util.List;

public class Service {

    Mapper mapper = new Mapper();
    List<Curso> cursos = new ArrayList<>();
    Long contador = 1L;

    public CursoResponseDTO cadastrar(CursoRequestDTO dto) {

        if (dto == null) {
            throw new RuntimeException("Erro ao cadastrar curso");
        }

        if (dto.nome() == null || dto.nome().isBlank()) {
            throw new RuntimeException("Erro ao cadastrar curso - Nome é nulo ou vazio");
        }

        if (dto.instrutor() == null || dto.instrutor().isBlank()) {
            throw new RuntimeException("Erro ao cadastrar curso - Instrutor é nulo ou vazio");
        }

        if (dto.cargaHoraria() <= 0) {
            throw new IllegalArgumentException("Erro ao cadastrar curso - Carga horaria NÃO permitida.");
        }
        Curso curso = mapper.toEntity(dto);
        curso.setId(contador++);
        cursos.add(curso);

        return mapper.toDTO(curso);
    }


    public Curso buscarPorId(Long id) {
        for (Curso curso : cursos) {
            if (curso.getId().equals(id)) {
                return curso;
            }
        }
        throw new RuntimeException("Erro ao buscar curso");
    }


    public CursoResponseDTO atualizar(Long id, CursoRequestDTO dto) {
        if (dto == null) {
            throw new RuntimeException("Erro ao cadastrar curso");
        }

        if (dto.nome() == null || dto.nome().isBlank()) {
            throw new RuntimeException("Erro ao cadastrar curso - Nome é nulo ou vazio");
        }

        if (dto.instrutor() == null || dto.instrutor().isBlank()) {
            throw new RuntimeException("Erro ao cadastrar curso - Instrutor é nulo ou vazio");
        }

        if (dto.cargaHoraria() <= 0) {
            throw new IllegalArgumentException("Erro ao cadastrar curso - Carga horaria NÃO permitida.");
        }
        Curso curso = buscarPorId(id);

        curso.setNome(dto.nome());
        curso.setInstrutor(dto.instrutor());
        curso.setCargaHoraria(dto.cargaHoraria());

        return mapper.toDTO(curso);
    }


    public CursoResponseDTO desativar(Long id) {
        Curso curso = buscarPorId(id);

        if (!curso.isAtivo()) {
            throw new RuntimeException("Erro ao desativar curso - curso está inativo.");
        }

        curso.setAtivo(false);
        return mapper.toDTO(curso);
    }


    public List<CursoResponseDTO> listarTodos() {
        List<CursoResponseDTO> listDTO = new ArrayList<>();
        for (Curso curso : cursos) {
            listDTO.add(mapper.toDTO(curso));
        }
        return listDTO;
    }
}

