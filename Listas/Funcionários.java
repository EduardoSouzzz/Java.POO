public class Funcionario {

    private int id;
    private String nome;
    private double salario;
    private double porcentagem;
    private int idDessejado;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void AumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);

    }

    public void info() {
        System.out.println(id + ", " + nome + ", " + salario);
    }
}



// MAIN:

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinhaClass_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> listfc = new ArrayList<>();

        System.out.print("Quantos Funcioários serão registrados?: ");
        int n = sc.nextInt();

        System.out.println();


        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionário número " + i + ":");

            System.out.print("ID: ");
            int id = sc.nextInt();


            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();


            System.out.print("Salário: ");
            double salario = sc.nextDouble();


            Funcionario fc = new Funcionario(id, nome, salario);

            listfc.add(fc);

        }

        System.out.println();

        System.out.println("Digite o id do funcionario que terá aumento salarial: ");
        int idDesejado = sc.nextInt();

        Integer pos = position(listfc, idDesejado);
        if (pos == null) {
            System.out.println("ID, NÃO Existe.");

        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();

            listfc.get(pos).AumentarSalario(porcentagem);
        }


        for (Funcionario f : listfc) {
            f.info();
        }

        sc.close();
    }

    public static Integer position (List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
