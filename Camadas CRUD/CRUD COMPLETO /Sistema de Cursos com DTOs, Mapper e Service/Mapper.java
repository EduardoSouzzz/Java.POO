public class Mapper {

    public Curso toEntity(CursoRequestDTO dto) {

        return new Curso(
                null,
                dto.nome(),
                dto.instrutor(),
                dto.cargaHoraria(),
                true
        );
    }

    public CursoResponseDTO toDTO(Curso curso) {

        return new CursoResponseDTO(
                curso.getId(),
                curso.getNome(),
                curso.getInstrutor(),
                curso.getCargaHoraria(),
                curso.isAtivo()
        );
    }
}
