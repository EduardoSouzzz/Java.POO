{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        Set<Livro> livros = new HashSet<>();

        System.out.print("Digite quantos livros deseja add: ");
        int qntd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o titulo do livro " + (i + 1) + ": ");
            String titulo = sc.nextLine();

            System.out.print("Digite o autor do livro " + titulo + ": ");
            String autor = sc.nextLine();

            System.out.print("Digite o ISBN do livro " + titulo + ": ");
            String isbn = sc.nextLine();

            Livro livro = new Livro(titulo, autor, isbn);
            biblioteca.addLivro(livro);

            System.out.println();

        }
        System.out.println("\nLivros cadastrados:");
        biblioteca.listaLivros();

        sc.close();
    }
}
