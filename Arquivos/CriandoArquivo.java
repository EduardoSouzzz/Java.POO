import java.io.*;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) throws Exception {

        // Escrevendo um Arquivo em uma pasta no
        // DISCO LOCAL (C:)
        String caminhoArq = "C:\\Novapasta\\dados.txt" ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        try (BufferedWriter esc = new BufferedWriter(new FileWriter(caminhoArq))) {

            esc.write("Nome: " + nome);
            esc.write("Idade: " + idade);

        } catch (IOException E) {
            System.out.println("Erro ao escrever o arquivo: " + E.getMessage());
        }
    }
}
