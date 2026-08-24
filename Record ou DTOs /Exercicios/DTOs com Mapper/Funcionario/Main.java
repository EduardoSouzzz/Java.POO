void main() {

    FuncionarioController controller = new FuncionarioController();

    FuncionarioRequestDTO request = new FuncionarioRequestDTO(
            "Jão",
            "jãocris287@gmail.com",
            5900.00,
            "Pleno",
            "TI"
    );

    FuncionarioResponseDTO response = controller.cadastrar(request);
    System.out.println(response);
}
