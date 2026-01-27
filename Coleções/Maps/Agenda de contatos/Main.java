
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.print("Digite quantos contatos deseja cadastrar-los: ");
        int qntd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qntd; i++) {
            System.out.print("\nDigite o nome do contato " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite o telefone do contato " + (i + 1) + ": ");
            String telefone = sc.nextLine();

            agenda.addContato(nome, telefone);
            System.out.println();
        }

        System.out.print("Deseja remover algum contato? (S/N): ");
        char resposta = sc.next().toUpperCase().charAt(0);
        sc.nextLine();

        if (resposta == 'S') {
            System.out.print("Digite o contato que deseja remover: ");
            String contato = sc.nextLine();

            agenda.removerContato(contato);
            System.out.println("Contato removido com sucesso!");

        } else {
            System.out.println("OK, obrigado por interagir!");
        }
        System.out.println("\n=== Contatos listados ===");
        agenda.listContatos();

    }
}
