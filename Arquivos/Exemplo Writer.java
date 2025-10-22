import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) throws Exception {

        // BufferedReader -> Leitor = Ler
        // BufferedWriter -> Escritor = Escreve

        FileWriter bw = new FileWriter("arquivo.txt");
        BufferedWriter escritor = new BufferedWriter(bw);

        escritor.write("Olá tudo certo?");
        escritor.close(); // -> Sempre Feche o Buffer.
    }
}
