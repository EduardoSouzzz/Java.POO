import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> relatorios = new ArrayList<>();
        relatorios.add("GG: Java 2025/2026");
        relatorios.add("GG2: SpringBoot & MySql 2026");

        System.out.println("Tamanho da lista: " + tamanhoDaLista(relatorios));
        System.out.println("Lista do relatório abaixo:");
        imprimirLista(relatorios);
    }
    public static int tamanhoDaLista(List<?> lista) {
        return lista.size();
    }

    public static void imprimirLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj.toString());
        }
    }
}
