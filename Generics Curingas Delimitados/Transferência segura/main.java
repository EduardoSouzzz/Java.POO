import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Integer> origem = new ArrayList<>();
        origem.add(1);
        origem.add(2);
        origem.add(3);

        List<Number> destino = new ArrayList<>();

        transferir(origem, destino);
        System.out.println("Origem: " + origem);
        System.out.println("Destinos: " + destino);

    }
    public static void transferir(List<? extends Number> origem,
                                  List<? super Number> destino) {
        for (Number num : origem) {
            destino.add(num);
        }
    }
}
