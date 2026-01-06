import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    private Set<Livro> livros;

    public Biblioteca() {
        livros = new HashSet<>();
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public void listaLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() +
                    " - " + livro.getIsbn());
        }
    }
}
