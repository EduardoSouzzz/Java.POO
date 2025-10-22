import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) throws Exception {
        
        // Escrevendo um Arquivo em uma pasta no
        // DISCO LOCAL (C:)

        String caminhoArq = "C:/Novapasta/Files.txt";
        boolean acrescentarNoArq = false;

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArq, acrescentarNoArq))) {

            escritor.write("Velozes e Furiosos\n");
            escritor.write("Homem-Aranha\n");
            escritor.write("Filme 1\n");
            escritor.write("Filme 2\n");

            System.out.println("Escreveu no arquivo!");
        } catch (Exception error) {
            System.out.println("Houve erro ao escrever no arquivo");
        }
    }
}
