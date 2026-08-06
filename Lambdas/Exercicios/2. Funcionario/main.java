
void main() {

    List<Funcionario> funcionarios = List.of(
            new Funcionario("Carlos", "Senior", 15.500, LocalDate.of(2026, 7, 20)),
            new Funcionario("Fernanda", "Pleno", 9.300, LocalDate.of(2026, 6, 29)),
            new Funcionario("Reinaldo", "Junior", 4.800, LocalDate.of(2026, 7, 12)),
            new Funcionario("Suelen", "Estagiaria", 2.500, LocalDate.of(2026, 8, 5)),
            new Funcionario("Fabio", "Senior", 15.500, LocalDate.of(2026, 8, 2)),
            new Funcionario("Camila", "Junior", 4.750, LocalDate.of(2026, 7, 27))
    );

    List<Funcionario> salarioMaiorQue3000 = funcionarios.stream()
            .filter(f -> f.getSalario() > 3.000)
            .toList();
    System.out.println(salarioMaiorQue3000);

    boolean salarioAcimaDe10000 = funcionarios.stream()
            .anyMatch(f -> f.getSalario() > 10.000);
    System.out.println(salarioAcimaDe10000);
}
