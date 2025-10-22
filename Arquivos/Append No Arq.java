import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) throws Exception {

        String caminhoArq = "arquivo.txt";
        boolean acrescentarNoArq = true;

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArq, acrescentarNoArq))) {

            escritor.write("A\n");
            escritor.write("B\n");
            escritor.write("C\n");

            System.out.println("Escreveu no arquivo!");
        } catch (Exception error) {
            System.out.println("Houve erro ao escrever no arquivo");
        }
    }
}
