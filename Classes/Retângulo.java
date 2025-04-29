public class Retangulo {

    public double largura;
    public double altura;

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }

    public double diagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
}

import java.util.Scanner;

public class MinhaClass_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();


        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

    }
}
