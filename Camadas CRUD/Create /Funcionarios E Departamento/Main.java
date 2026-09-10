void main() {

    Service service = new Service();

    Departamento departamento1 = new Departamento(
            1L, "Tecnologia", true);

    Departamento departamento2 = new Departamento(
            2L, "Financeiro", true);

    Departamento departamento3 = new Departamento(
            3L, "RH", true);



    Funcionario funcionario1 = new Funcionario(
            10L, "João", 3000.00 ,true, 1L);

    Funcionario funcionario2 = new Funcionario(
            20L, "Maria", 4000.00 ,true, 1L);

    Funcionario funcionario3 = new Funcionario(
            30L, "Carlos", 3500.00 ,false, 2L);


    service.departamentos.add(departamento1);
    service.departamentos.add(departamento2);

    service.funcionarios.add(funcionario1);
    service.funcionarios.add(funcionario3);



    // CADASTRAR DEPARTAMENTO NOVO;
    service.cadastrarDepartamento(departamento3);
    System.out.println(departamento3);

    System.out.println();

    // TENTAR CADASTRAR DEPARTAMENTO DUPLICADO;
    try {
        service.cadastrarDepartamento(departamento1);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    System.out.println();

    // CADASTRAR FUNCIONÁRIO;
    service.cadastrarFuncionario(3L, funcionario2);
    System.out.println(funcionario2);

    System.out.println();

    // TENTAR CADASTRAR FUNCIONÁRIO EM DEPARTAMENTO INEXISTENTE;
    try {
        service.cadastrarFuncionario(9L, funcionario3);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    System.out.println();

    // BUSCAR FUNCIONÁRIO 10
    System.out.println(service.buscarFuncionario(10L));

    // AUMENTAR SALÁRIO DO FUNCIONÁRIO 10 EM 10%
    service.aumentarSalario(10L, 10);
    System.out.println(service.buscarFuncionario(10L));

    // VERIFICAR SE SOMENTE O FUNCIONARIO 10 TEVE SALARIO AUMENTADO
    System.out.println("ID 20: " + service.buscarFuncionario(20L).getSalario());
    System.out.println("ID 30: " + service.buscarFuncionario(30L).getSalario());

    System.out.println();

    // TRANFERIR FUNCIONARIO 10 PARA DEPARTAMENTO 2
    service.transferirFuncionario(10L, 2L);
    System.out.println(service.buscarFuncionario(10L));

    // VERIFICAR SE SOMENTE O FUNCIONARIO 10 MUDOU DE DEPARTAMENTO
    System.out.println("ID 20: " + service.buscarFuncionario(20L).getIdDepartamento());
    System.out.println("ID 30: " + service.buscarFuncionario(30L).getIdDepartamento());

    System.out.println();

    // TENTAR DESATIVAR DEPARTAMENTO 1
    try {
        service.desativarDepartamento(1L);
    }  catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    System.out.println();

    // DESATIVAR OS FUNCIONARIOS DO DEPARTAMENTO 1
    funcionario2.setAtivo(false);

    // DESATIVAR DEPARTAMENTO 1
    service.desativarDepartamento(1L);

}
