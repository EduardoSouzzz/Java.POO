
void main() {

    Funcionario funcionario = new Funcionario(10L, "Zé", "zeSIMmamae@gmail.com",
            "Gerente", 12573.00);

    Funcionario funcionario1 = new Funcionario(20L, "Lucas", "luqnha1910@gmail.com",
            "Junior", 3900.00);

    Service service = new Service();
    service.funcionarios.add(funcionario);
    service.funcionarios.add(funcionario1);

    service.atualizarFuncionario(10L, funcionario);
    System.out.println(funcionario1);

}

