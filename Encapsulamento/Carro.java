public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;


    public Carro (String marca, String modelo, int ano, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar (double valor) {
        this.velocidadeAtual += valor;
    }

    public void frear (double valor) {
        this.velocidadeAtual -= valor;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    // marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }


    // modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    // ano;
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


    // velociadade;
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
      return velocidadeAtual;
    } 
}

// aplicando na classe Main
import java.util.Scanner;

public class MinhaClass_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carro car = new Carro("fiat", "uno", 2010, 0.0 );

        // marca;
        System.out.println("Digite a marca do carro: ");
        String marcaDigitada = sc.nextLine();
        car.setMarca(marcaDigitada);
        System.out.println("Marca do carro: " + car.getMarca());
        System.out.println();

        // modelo;
        System.out.println("Digite o modelo do " + car.getMarca() + ":");
        String modeloDigitado = sc.nextLine();
        car.setModelo(modeloDigitado);
        System.out.println("Modelo do " + car.getMarca() + " : " + car.getModelo());
        System.out.println();

        // ano;
        System.out.println("Digite o ano do " + car.getModelo() + " : ");
        int anoDigitado = sc.nextInt();
        car.setAno(anoDigitado);
        System.out.println("O ano do " + car.getMarca() + " " + car.getModelo() + " : " + car.getAno());
        System.out.println();

        // velocidade;
        System.out.println("Digite a velocidade que o " + car.getModelo() + " acelerou: ");
        int aceleracao = sc.nextInt();
        car.acelerar(aceleracao);
        System.out.println("Acelerou = " + car.getVelocidadeAtual() + " KM/h");
        System.out.println();

        System.out.println("Digite a velocidade que o " + car.getModelo() + " freou: ");
        int freando = sc.nextInt();
        car.frear(freando);
        System.out.println("Velocidade atual do " + car.getModelo() + " = " + car.getVelocidadeAtual() + " KM/h");


        sc.close();
    }
}

