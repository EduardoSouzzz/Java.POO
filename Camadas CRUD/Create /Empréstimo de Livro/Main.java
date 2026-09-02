
void main() {

    Service service = new Service();
    Aluno aluno = new Aluno(
            15L,
            "Zé",
            true
    );

    Livro livro = new Livro(
            80L,
            "A História do Brasil",
            250.50,
            true
    );
    service.alunos.add(aluno);
    service.livros.add(livro);

    double valor = service.emprestarLivro(15L, 80L);
    System.out.println("Emprestimo realizado com sucesso!");
    System.out.println("Valor: R$ " + valor);
    System.out.println("Livro disponível: " + livro.isDisponivel());
}

