import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ArrayList<Etiquetavel> etiquetavels = new ArrayList<>();

        System.out.println("C - Produto Comum");
        System.out.println("I - Produto Importado");
        System.out.println("U - Produto Usado");
        System.out.print("Digite se seu produto é Comum, Importado ou Usado: ");
        char produto = sc.next().toUpperCase().charAt(0);
        sc.nextLine();

        if (produto == 'C') {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            etiquetavels.add(new Produto(nome, preco));

        } else if (produto == 'I') {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            System.out.print("Digite a taxa do produto: ");
            double taxa = sc.nextDouble();

            etiquetavels.add(new ProdutoImportado(nome, preco, taxa));

        } else {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            System.out.print("Digite a data de fabricação do produto: ");
            LocalDate dataFabricacao = LocalDate.parse(sc.next(), fmt1);

            etiquetavels.add(new ProdutoUsado(nome, preco, dataFabricacao));
        }

        System.out.println("===== ETIQUETA PRODUTO =====");
        for (Etiquetavel etiquetavel : etiquetavels) {
            System.out.println(etiquetavel.gerarEtiqueta());
        }
    }
}
