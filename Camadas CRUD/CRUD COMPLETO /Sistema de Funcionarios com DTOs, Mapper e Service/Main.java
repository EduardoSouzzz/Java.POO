void main() {

    Service service = new Service();

    FuncionarioRequestDTO dto1 = new FuncionarioRequestDTO("Anna", "Desenvolvedora Java", 4000.00);
    FuncionarioRequestDTO dto2 = new FuncionarioRequestDTO("Bruno", "Analista de Dados", 3500.00);
    FuncionarioRequestDTO dto3 = new FuncionarioRequestDTO("Julia", "QA", 3000.00);

    FuncionarioResponseDTO funcionario1 = service.cadastrar(dto1);
    FuncionarioResponseDTO funcionario2 = service.cadastrar(dto2);
    FuncionarioResponseDTO funcionario3 = service.cadastrar(dto3);

    System.out.println("\n=== Funcionarios Cadastrados ===");
    System.out.println(funcionario1);
    System.out.println(funcionario2);
    System.out.println(funcionario3);

    System.out.println("\n=== Buscar funcionario ===");
    System.out.println(service.buscarPorId(funcionario2.id()));

    System.out.println("\n=== Atualizar dados do funcionario ===");

    FuncionarioRequestDTO atualizar = new FuncionarioRequestDTO("Zé", "Front-end", 2000.00);
    FuncionarioResponseDTO funcionarioAtualizado = service.atualizar(funcionario2.id(), atualizar);
    System.out.println(funcionarioAtualizado);

    System.out.println("\n=== Aumentar salario em 15% ===");
    System.out.println(service.aumentarSalario(funcionario3.id(), 15));

    System.out.println("\n=== Desativar funcionario ===");
    System.out.println(service.desativar(funcionario2.id()));

    System.out.println("\n=== Listar funcionario ===");
    System.out.println(service.listarFuncionarios());

    System.out.println("\n=== Tentar aumentar o salário de um funcionário inativo e tratar a exceção ===");
    try {
        service.aumentarSalario(funcionario2.id(), 10);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}
