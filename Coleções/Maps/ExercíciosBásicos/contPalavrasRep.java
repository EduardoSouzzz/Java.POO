import java.util.*;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Array de palavras (não uma String, mas um array de String[])
        String[] palavras = {"java", "map", "java", "lista", "map", "java"};

        Map<String, Integer> contador = new HashMap<>();
        for (String palavra : palavras) {

            if (contador.containsKey(palavra)) {
                // Palavra já existe: pega o valor atual e soma 1
                int qtdAtual = contador.get(palavra);
                contador.put(palavra, qtdAtual + 1);

            } else {
                // Palavra nova: insere com valor 1
                contador.put(palavra, 1);
            }
        }
        // Exibe o resultado
        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue() + " vez(es)");
        }
    }
}
