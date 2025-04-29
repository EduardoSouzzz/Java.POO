public class Funcionario {

    public String name;
    public double SalaryGross;
    public double taxa;
    public double percentage;

    public double salaryNet() {
        return SalaryGross - taxa;
    }

    public double IncreaseSalary() {
        return SalaryGross / (percentage / 100);
    }

    public double salaryEnd() {
        return salaryNet() + IncreaseSalary();
    }

}

import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        funcionario.name = sc.nextLine();
        funcionario.SalaryGross = sc.nextDouble();
        funcionario.taxa = sc.nextDouble();

        System.out.println("Name: " + funcionario.name);
        System.out.println("Gross salary: " + funcionario.SalaryGross);
        System.out.println("Tax: " + funcionario.taxa);

        System.out.println();
        System.out.println("Employee: " + funcionario.name + ", " +
                " $ " + funcionario.salaryNet());

        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        funcionario.percentage = sc.nextDouble();

        System.out.println();
        System.out.println("Updated data: " + funcionario.name + ", " +
                " $ " + funcionario.salaryEnd());

        sc.close();
    }
}
