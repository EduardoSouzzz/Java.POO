import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Relatorio> relatorios = new ArrayList<>();

        System.out.println("F - Relatório do Financeiro");
        System.out.println("E - Relatório do Estoque");
        System.out.println("C - Relatório dos Clientes \n");
        System.out.print("Digite qual Relatório você deseja analisar? (F/E/C): ");
        char resposta = sc.next().toUpperCase().charAt(0);
        sc.nextLine();


        if (resposta == 'F') {
            System.out.print("Digite o total de vendas: ");
            double totalVendas = sc.nextDouble();

            System.out.print("Digite o total de despesas: ");
            double totalDespesas = sc.nextDouble();

            relatorios.add(new RelatorioFinanceiro(totalVendas, totalDespesas));

        } else if (resposta == 'E') {
            System.out.print("Digite o nome do item: ");
            String nome = sc.nextLine();

            System.out.print("Digite a quantidade de itens: ");
            int quantidade = sc.nextInt();

            System.out.print("Digite o preço do item: ");
            double preco = sc.nextDouble();

            // Cria o relatório
            RelatorioEstoque re = new RelatorioEstoque();

            // adiciona o item dentro do relatório
            re.adicionarItem(new Item(nome, quantidade, preco));

            relatorios.add(re);

        } else if (resposta == 'C') {
            System.out.print("Digite o nome do cliente: ");
            String nome = sc.nextLine();

            System.out.print("Digite o email: ");
            String email = sc.nextLine();

            // cria uma lista
            List<Cliente> listaClientes = new ArrayList<>();
            listaClientes.add(new Cliente(nome, email));

            // passa a lista no construtor
            RelatorioClientes rc = new RelatorioClientes(listaClientes);
            relatorios.add(rc);
        }

        // mostra o relatório escolhido
        System.out.println("\n-------------------------------------");
        for (Relatorio r : relatorios) {
            System.out.println(r.gerar());
        }
    }
}
