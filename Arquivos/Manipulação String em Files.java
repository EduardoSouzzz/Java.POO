import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class gg2 {
    public static void main(String[] args) {

        String Caminho = "C:\\Users\\Marcelo\\" +
                "Intellij_JAVA\\Java_2\\src\\mensagem.txt";

        try (BufferedReader ler = new BufferedReader(new FileReader(Caminho))){
            String linha = ler.readLine(); // lendo

            String palavra = "Bom";
            int numeroLinha = 1;

            while (linha != null) {
                if (linha.toLowerCase().contains(palavra.toLowerCase())) {
                    System.out.println("A palavra foi encontrada na linha " + numeroLinha);
                }
                numeroLinha++;
                linha = ler.readLine();
            }
        } catch (IOException erro) {
            System.out.println("Deu Problema no Arquivo .txt, pois não há palavras que" +
                    "contém essa palavra.");
        }
    }
}
