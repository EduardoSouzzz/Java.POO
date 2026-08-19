void main() {

    Funcionario funcionario = new Funcionario(96L, "Zé", "zesilva@gmail.com",
            4000.00, "000.000.000-00", "senha123");

    FuncionarioResponseDTO funcDTO = new FuncionarioResponseDTO(
            funcionario.getId(), 
            funcionario.getNome(),
            funcionario.getEmail()
    );

    System.out.println("Informações do funcionario: " + funcDTO);
}
