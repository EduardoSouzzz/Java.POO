
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Estoque estoques = new Estoque();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos produtos deseja registrar: ");
        int registro = sc.nextInt();
        sc.nextLine();

        for (int i = 0;  i < registro; i++) {
            System.out.print("\nDigite o ID do produto " + (i + 1) + ": ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o NOME do produto "  + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a QUANTIDADE disponível desse produto "  + (i + 1) + ": ");
            int quantidade = sc.nextInt();


            Produto produtos = new Produto(id, nome, quantidade);
            estoques.addProduto(produtos);
        }

        System.out.print("\nDeseja remover algum produto do estoque? ");
        char respostaUsuario = sc.next().toUpperCase().charAt(0);

        if (respostaUsuario == 'S') {
            System.out.print("Digite o ID do produto: ");
            int id = sc.nextInt();
            estoques.removerProduto(id);
            System.out.println("Produto removido com sucesso!");

        } else if (respostaUsuario == 'N') {
            System.out.println("OK, produtos registrados com sucesso!");
        } else {
            System.out.println("ERRO, Informação digitada não identificada.");
        }

        // Atualizando
        System.out.print("\nDeseja atualizar a quantidade de algum produto? ");
        char resp = sc.next().toUpperCase().charAt(0);

        if (resp == 'S') {
            System.out.print("Digite o ID do produto: ");
            int id = sc.nextInt();

            System.out.print("Digite a nova quantidade: ");
            int novaQtd = sc.nextInt();
            estoques.atualizarQuantidade(id, novaQtd);

        } else if (resp == 'N') {
            System.out.println("OK, produtos registrados com sucesso!");
        } else {
            System.out.println("ERRO, Informação digitada não identificada.");
        }

        System.out.println("\n=== Produtos Adicionados ===");
        estoques.listarProdutos();

    }
}
