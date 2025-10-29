import java.io.*;

public class Writer {
    public static void main(String[] args) throws Exception {

        // Escrevendo um Arquivo em uma pasta no
        // DISCO LOCAL (C:)
        String caminhoArq = "mensagem.txt";

        try (BufferedReader ler = new BufferedReader(new FileReader(caminhoArq))) {
            String linha = ler.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = ler.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
