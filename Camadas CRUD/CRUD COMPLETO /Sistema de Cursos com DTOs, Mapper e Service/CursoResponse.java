public record CursoResponseDTO(

        Long id,
        String nome,
        String instrutor,
        double cargaHoraria,
        boolean ativo


) {
    @Override
    public String toString() {
        return "CursoResponseDTO " +
                " | id: " + id +
                " | nome: " + nome +
                " | instrutor: " + instrutor +
                " | cargaHoraria: " + cargaHoraria +
                " | ativo: " + ativo;
    }
}
