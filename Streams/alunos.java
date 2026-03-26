import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Zé", 6.8),
                new Aluno("Ana", 8.5),
                new Aluno("Carlos", 9.0),
                new Aluno("Eva", 7.5)
        );

        alunos.stream()
                .filter(a -> a.getMedia() >= 7.0)
                .map(i -> i.getNome() +
                        " - Aprovado " + i.getMedia())
                .forEach(System.out::println);
    }
}
