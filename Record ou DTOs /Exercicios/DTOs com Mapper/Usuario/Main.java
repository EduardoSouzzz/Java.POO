void main() {

    UsuarioRequestDTO requestDTO = new UsuarioRequestDTO(
            "Zé",
            "ze2000@gmail.com",
            "12345",
            "123.456.789-10",
            65
    );

    UsuarioMapper mapper = new UsuarioMapper();
    Usuario usuario = mapper.toEntity(requestDTO);

    UsuarioResponseDTO responseDTO = mapper.toDTO(usuario);
    System.out.println(responseDTO);


}
