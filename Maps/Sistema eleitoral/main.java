
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Eleicao eleicons = new Eleicao();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite quantos candidatos vc registra-lá: ");
        int registro = sc.nextInt();
        sc.nextLine();

        while (registro <= 0) {
            System.out.println("Números de candidatos inválidos, por" +
                    "favor, digite novamente");
            registro = sc.nextInt();
        }
        System.out.println("OK, vamos prosseguir!");
        System.out.println();


        for (int i = 0; i < registro; i++) {
            System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite o partido do candidato " + (i + 1) + ": ");
            String partido = sc.nextLine();


            Candidato candidato = new Candidato(nome, partido);
            eleicons.cadastrarCandidato(candidato);
            System.out.println();
        }

        System.out.print("Digite qual candidato vc realizar a votação: ");
        String votando = sc.nextLine();
        eleicons.votar(votando);

        System.out.println("=== Resultado da eleição ===");
        eleicons.mostrarResultado();
        System.out.println();

        System.out.println("=== Candidato vencedor ===");
        System.out.println(eleicons.candidatoVencedor());
    }
}
