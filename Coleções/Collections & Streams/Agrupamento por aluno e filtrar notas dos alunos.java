public record Aluno(String nome, String turma, double nota) {
}
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = List.of(
                new Aluno("Ana",     "A", 8.0),
                new Aluno("Carlos",  "A", 4.0),
                new Aluno("Beatriz", "B", 7.0),
                new Aluno("João",    "B", 3.0),
                new Aluno("Lucas",   "A", 9.0),
                new Aluno("Carla",   "B", 5.5));

        Set<Aluno> uniao = new HashSet<>();
        uniao.addAll(alunos);

        Map<String, List<Aluno>> resultado = alunos.stream()
                .filter(a -> a.nota() >= 6)
                .collect(Collectors.groupingBy(Aluno::turma));
        System.out.println(resultado);

    }
}
