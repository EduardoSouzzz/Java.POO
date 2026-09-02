import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Aluno> alunos = new ArrayList<>();
    List<Livro> livros = new ArrayList<>();

    public double emprestarLivro(Long idAluno, Long idLivro) {

        // 1. encontrar aluno
        Aluno alunoEncontrado = null;

        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(idAluno)) {
                alunoEncontrado = aluno;
                break;
            }
        }
        // 2. verificar se aluno existe
        if (alunoEncontrado == null) {
            throw new IllegalArgumentException("Aluno não encontrado.");
        }

        // 3. verificar se aluno está ativo
        if (!alunoEncontrado.isAtivo()) {
            throw new IllegalArgumentException("Aluno está INATIVO.");
        }

        // 4. encontrar livro

        Livro livroEncontrado = null;

        for (Livro livro : livros) {
            if (livro.getId().equals(idLivro)) {
                livroEncontrado = livro;
                break;
            }
        }

        // 5. verificar se livro existe
        if (livroEncontrado == null) {
            throw new IllegalArgumentException("Livro não encontrado.");
        }

        // 6. verificar se livro está disponivel
        if (!livroEncontrado.isDisponivel()) {
            throw new IllegalArgumentException("Livro NÃO está disponivel.");
        }
        // 7. marcar livro como indisponivel
        livroEncontrado.setDisponivel(false);

        // 8. retornar valor do emprestimo
        return livroEncontrado.getPreco();
    }
}
