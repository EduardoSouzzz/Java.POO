import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Aluno> alunos = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();

    public double matricularAluno(Long idAluno, Long idCurso, int quantidade) {

        // 1. validar quantidade
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade é inválida.");
        }

        // 2. encontrar aluno
        Aluno alunoEncontrado = null;
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(idAluno)) {}
            alunoEncontrado = aluno;
            break;
        }

        // 3. verificar se aluno existe
        if (alunoEncontrado == null) {
            throw new IllegalArgumentException("Aluno NÃO encontrado.");
        }

        // 4. verificar se aluno está ativo
        if (!alunoEncontrado.isAtivo()) {
            throw new IllegalArgumentException("Aluno está INATIVO.");
        }

        // 5. encontrar curso
        Curso cursoEncontrado = null;
        for (Curso curso : cursos) {
            if (curso.getId().equals(idCurso)) {}
            cursoEncontrado = curso;
            break;
        }

        // 6. verificar se curso existe
        if (cursoEncontrado == null) {
            throw new IllegalArgumentException("Curso NÃO encontrado.");
        }

        // 7. verificar se curso está ativo
        if (!cursoEncontrado.isAtivo()) {
            throw new IllegalArgumentException("Curso está INATIVO.");
        }

        // 8. verificar se existem vagas suficientes
        if (cursoEncontrado.getVagas() < quantidade) {
            throw new IllegalArgumentException("Vagas não disponiveis.");
        }

        // 9. calcular valor total
        double valorTotal = cursoEncontrado.getPreco() * quantidade;

        // 10. dimunuir vagas
        int diminuirVagas = cursoEncontrado.getVagas() - quantidade;
        cursoEncontrado.setVagas(diminuirVagas);

        // 11. retornar valor total
        return valorTotal;
    }
}
