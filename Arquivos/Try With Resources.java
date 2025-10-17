import java.io.BufferedReader;
import java.io.FileReader;

public class GG {
    public static void main(String[] args) {
        // C:\Users\Marcelo\Intellij_JAVA\Java_2\src\GGzin

        String caminhoArquivo = "C:\\Users\\Marcelo\\Intellij_JAVA\\Java_2\\src\\GGzin";

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = leitor.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
        } catch (Exception erro) {
            System.out.println("Erro, Houve um problema ao ler o arquivo");
        }
    }
}
