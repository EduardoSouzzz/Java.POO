void main() {

    Service service = new Service();

    CursoRequestDTO dto1 = new CursoRequestDTO("Java Backend", "Carlos", 80);
    CursoRequestDTO dto2 = new CursoRequestDTO("Banco de Dados", "Fernanda", 40);
    CursoRequestDTO dto3 = new CursoRequestDTO("Spring Boot", "Ricardo", 60);
    CursoRequestDTO dto4 = new CursoRequestDTO("Python", "Lopez", -10);

    CursoResponseDTO curso1 = service.cadastrar(dto1);
    CursoResponseDTO curso2 = service.cadastrar(dto2);
    CursoResponseDTO curso3 = service.cadastrar(dto3);


    System.out.println("=== Cursos Cadastrados ===");
    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(curso3);


    System.out.println("\n=== Buscar Curso ===");
    System.out.println(service.buscarPorId(curso1.id()));


    System.out.println("\n=== Atualizar Curso ===");

    CursoRequestDTO atualizar = new CursoRequestDTO("C++", "Eli Nik", 100);

    CursoResponseDTO cursoAtualizado = service.atualizar(curso2.id(), atualizar);
    System.out.println(cursoAtualizado);


    System.out.println("\n=== Desativar Curso ===");
    System.out.println(service.desativar(curso3.id()));


    System.out.println("\n=== Listar todos os Cursos === ");
    System.out.println(service.listarTodos());


    System.out.println("\n=== TENTAR cadastrar um curso com carga horaria negativa ===");

    try {
        CursoResponseDTO curso4 = service.cadastrar(dto4);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}
