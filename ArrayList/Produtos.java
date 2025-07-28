import java.util.ArrayList;
import java.util.Scanner;

public class MC2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do produto: " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: " + (i + 1) + ": ");
            double preco = sc.nextDouble();
            sc.nextLine();

            System.out.println();


            Produto p = new Produto(nome, preco);
            produtos.add(p);

        }
        System.out.println();


        System.out.println("Produtos Cadastrados: ");
        for (Produto p : produtos) {
            System.out.println("- " + p.getNome() + " | R$ " + p.getpreco());
        }

        double soma = 0;
        for (Produto p : produtos) {
            soma += p.getpreco();
        }

        System.out.println("Soma dos Produtos: R$ " + soma);

        sc.close();
    }
}
