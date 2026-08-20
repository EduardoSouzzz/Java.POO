void main() {

    ClienteRequestDTO requestDTO = new ClienteRequestDTO(
            "Dona",
            "zedonaTRAIRA@gmail.com",
            "Belterra",
            291,
            "Santo Amaro-SP"
    );

    ClienteMapper clienteMapper = new ClienteMapper();
    Cliente cliente = clienteMapper.toEntity(requestDTO);

    ClienteResponseDTO responseDTO = clienteMapper.toDTO(cliente);
    System.out.println(responseDTO);
}
