void main() {

    Service service = new Service();

    Projeto projeto1 = new Projeto(1L, "Sistema ERP", 50000.00, true);
    Projeto projeto2 = new Projeto(2L, "Aplicativo Mobile", 30000.00, true);
    Projeto projeto3 = new Projeto(3L, "Sistema Institucional", 10000.00, true);

    Funcionario funcionario1 = new Funcionario(10L, "João", true, 1L);
    Funcionario funcionario2 = new Funcionario(20L, "Maria", true, 1L);
    Funcionario funcionario3 = new Funcionario(30L, "Carlos", false, 2L);

    service.projetos.add(projeto2);
    service.projetos.add(projeto3);

    service.funcionarios.add(funcionario1);
    service.funcionarios.add(funcionario3);


    System.out.println("1. Cadastrar novo projeto: ");
    service.cadastrarProjeto(projeto1);
    System.out.println(projeto1);
    System.out.println();


    System.out.println("2. Tentar cadastrar projeto duplicado: ");
    try {
        service.cadastrarProjeto(projeto1);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    System.out.println();


    System.out.println("3. Cadastrar funcionario em projeto existente: ");
    System.out.println(service.cadastrarFuncionario(1L, funcionario2));
    System.out.println();


    System.out.println("4. Tentar cadastrar funcionario em projeto inexistente: ");
    try {
        service.cadastrarFuncionario(7L, funcionario3);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    System.out.println();


    System.out.println("5. Buscar funcionario: ");
    System.out.println(service.buscarFuncionario(30L));
    System.out.println();


    System.out.println("6. Buscar projeto: ");
    System.out.println(service.buscarProjeto(3L));
    System.out.println();


    System.out.println("7. Alocar funcionario 10L no projeto 2L: ");
    service.alocarFuncionario(10L, 2L);
    System.out.println(service.buscarFuncionario(10L));
    System.out.println();

    System.out.println("8. Verificar que somente João mudou de projeto: ");
    System.out.println(service.buscarFuncionario(10L));
    System.out.println(service.buscarFuncionario(20L));
    System.out.println(service.buscarFuncionario(30L));
    System.out.println();


    System.out.println("9. BORA ALOCAR ENTÃO");
    System.out.println();

    System.out.println("10. Desativar funcionario 10L: ");
    service.desativarFuncionario(10L);
    System.out.println(service.buscarFuncionario(10L));
    System.out.println();


    System.out.println("11. Tentar desativar projeto 1L: ");
    try {
        service.desativarProjeto(1L);
    }  catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    System.out.println();


    System.out.println("12. Verificar que ainda existe Maria ativa no projeto 1 -> Deve bloquear: ");
    System.out.println(service.buscarFuncionario(20L));
    System.out.println();


    System.out.println("13. Desativar Maria: ");
    service.desativarFuncionario(20L);
    System.out.println(service.buscarFuncionario(20L));
    System.out.println();

    System.out.println("14. Desativar projeto 1: ");
    service.desativarProjeto(1L);
    System.out.println(service.buscarProjeto(1L));
}
