
void main() {

    List<Livro> livros = new ArrayList<>(List.of(
            new Livro("A espera pela felicidade", "Edgar Gomes", "Romance", 300, 1999),
            new Livro("Tales de Mileto e a Eletricidade Estatica", "Edward Guerrard", "Filosofia e Fisica", 100, 1986),
            new Livro("A bela e a fera", "Jhow Clinton", "Romance", 400, 1995),
            new Livro("A conquista dos Aliados", "Anderson Gutierres", "História", 500, 2016),
            new Livro("Imperio Otomano, Consequencias e Conquistas", "Niett Filds", "História", 765, 1974)
    ));

    Map<String, List<Livro>> porGenero = livros.stream()
            .collect(Collectors.groupingBy(Livro::getGenero));

    System.out.println("Agrupamento por Genero: " + porGenero);

    livros.sort(Comparator.comparing(Livro::getPaginas));
    System.out.println("Ordenado por paginas: " + livros);

    long qntd = livros.stream()
            .filter(l -> l.getAno() > 2015).count();
    System.out.println("Livros lançados depois de 2015: " + qntd);
}
