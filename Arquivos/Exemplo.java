import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class GG {
    public static void main(String[] args) {
      
        String caminhoArquivo = "C:\\Users\\Marcelo\\Intellij_JAVA\\Java_2\\src\\GGzin";
        BufferedReader ler = null;

        try {
            FileReader esc = new FileReader(caminhoArquivo);
            ler = new BufferedReader(esc);

            String linha = ler.readLine(); // -> lER lINHA.
            while (linha != null) {
                System.out.println(linha);
                linha = ler.readLine();
            }
        } catch (Exception e) {
            System.out.println("Deu ruim");
        }
    }
}
