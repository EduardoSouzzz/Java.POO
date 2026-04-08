public record Compra(String cliente, String produto) {
}

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Compra> compras = List.of(
                new Compra("Ana",    "Notebook"),
                new Compra("Carlos", "Mouse"),
                new Compra("Beatriz","Notebook"),
                new Compra("João",   "Teclado"),
                new Compra("Ana",    "Mouse"));

        Map<String, Long> contagem = compras.stream()
                .collect(Collectors.groupingBy(Compra::produto, Collectors.counting()));
        // agrupa por produto, e conta cada grupo

        Set<String> duplicatas = contagem.entrySet().stream() // entrySet == vira uma coleção d entradas "[]"
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey) // pega só a chave do map "Produto"
                .collect(Collectors.toSet()); // junta tudo no set
        System.out.println(duplicatas);
    }
}
