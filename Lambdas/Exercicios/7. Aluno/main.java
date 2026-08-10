
void main() {

    List<Aluno> alunos = List.of(
            new Aluno("Atletico-MG", "Matemática", 7.5),
            new Aluno("Barcelona", "Português", 6.4),
            new Aluno("Corinthians", "História", 9.7),
            new Aluno("Ituano", "Matemática", 8.2),
            new Aluno("Fluminense", "Geografia", 5.8),
            new Aluno("Corinthians", "Filosofia", 10.0),
            new Aluno("Mirassol", "Ciências", 7.3),
            new Aluno("Ituano", "Inglês", 7.5)
    );

    OptionalDouble media = alunos.stream()
            .filter(a -> Objects.equals(a.getDisciplina(), "Matemática"))
            .mapToDouble(Aluno::getNota)
            .average();
    System.out.println("Média de matemática: " + media);

    Map<String, List<Aluno>> porDisciplina = alunos.stream()
            .collect(Collectors.groupingBy(Aluno::getDisciplina));
    System.out.println("Agrupado por disciplina: " + porDisciplina);

    long notaAbaixoDeSeis = alunos.stream()
            .filter(n -> n.getNota() < 6.0)
            .count();
    System.out.println("Notas abaixo de 6.0: " + notaAbaixoDeSeis);
}
