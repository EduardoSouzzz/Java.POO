
void main() {

    Service service = new Service();
    Aluno aluno = new Aluno(
            25L,
            "Zé",
            true);

    Curso curso = new Curso(
            60L,
            "Java Backend COMPLETO",
            500.00,
            20,
            true);

    service.alunos.add(aluno);
    service.cursos.add(curso);

    double matricula = service.matricularAluno(25L, 60L, 5);
    System.out.println("Valor total: R$ " + matricula);
    System.out.println("Vagas restantes: " + curso.getVagas());
}

