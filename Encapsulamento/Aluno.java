public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // nota1;
    public double getNota1() {
        return nota1;
    }
    public void setNota1 (double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota1 Invalida.");
        }

    }


    // nota2;
    public double getNota2() {
        return nota2;
    }
    public void setNota2 (double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota2 Invalida.");
        }
    }


    public double media() {
        return (nota1 + nota2 ) / 2;
    }

    public void situacao() {
        double m = media();
        if (m > 7) {
            System.out.println("Aprovado");

        } else if (m >= 5) {
            System.out.println("Recuperação");

        } else {
            System.out.println("Reprovado");
        }
    }

}
