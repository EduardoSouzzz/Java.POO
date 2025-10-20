import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class gg2 {
    public static void main(String[] args) {

        String Caminho = "C:\\Users\\Marcelo\\" +
                "Intellij_JAVA\\Java_2\\src\\mensagem.txt";

        int contadorDeLinhas = 0;
        int contadorDePalavras = 0;
        int contadorDeCaractere = 0;

        try (BufferedReader leitor = new BufferedReader(
                new FileReader(Caminho))){

            String linha = leitor.readLine();

            while (linha != null) {
                contadorDeLinhas++;
                contadorDePalavras += linha.length();
                contadorDeCaractere += linha.split("\\s+").length;

                linha = leitor.readLine();
            }

            System.out.println("Linhas = " + contadorDeLinhas);
            System.out.println("Palavras = " + contadorDePalavras);
            System.out.println("Caractere = " + contadorDeCaractere);
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null,
                    "Erro, Houve um Problema ao" +
                            "ler o arquivo");
        }
    }
}
