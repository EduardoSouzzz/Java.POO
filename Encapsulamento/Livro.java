public class Livro {

    private String titulo;
    private String autor;
    private int paginas;
    private boolean lido;

    // construtores;
    public Livro (String titulo, String autor, int paginas, boolean lido) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.lido = lido;
    }

    // titulo do livro;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    // autor;
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


    // paginas;
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    // lido;
    public boolean getLido() {
        return lido;
    }
    public void setLido(boolean lido) {
        this.lido = lido;
    }


    public void marcarComoLido() {
        this.lido = true;
    }

    public void exibirInfo(String titulo, String autor, int paginas, boolean lido) {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Lido: " + (lido ? "sim" : "nao"));
    }
}


import java.util.Scanner;

public class MinhaClass_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Livro lvr = new Livro("Pessoas", "DinizAlmeida", 250, true);

        System.out.println("Qual o titulo do livro?: ");
        String tituloLvr = sc.nextLine();
        lvr.setTitulo(tituloLvr);
        System.out.println();

        System.out.println("Qual o autor do livro " + lvr.getTitulo() + " ?:");
        String autorLvr = sc.nextLine();
        lvr.setAutor(autorLvr);
        System.out.println();

        System.out.println("Quantas paginas o livro " + lvr.getTitulo() + " tem?: ");
        int paginasLvr = sc.nextInt();
        lvr.setPaginas(paginasLvr);
        System.out.println();

        System.out.println("Você já terminou de ler o livro " + lvr.getTitulo() + " (sim/não): ");
        sc.nextLine();
        String resposta = sc.nextLine().toLowerCase();

        boolean leu;
        if (resposta.equals("sim")) {
            leu = true;
        } else {
            leu = false;
            System.out.println("Já que não terminou o livro, quantas paginas você já leu?: ");
            int paginasLidas = sc.nextInt();
            System.out.println("Você leu " + paginasLidas + " paginas!");

        }
        lvr.setLido(leu);
        System.out.println();

        // info;
        lvr.exibirInfo(lvr.getTitulo(), lvr.getAutor(), lvr.getPaginas(), lvr.getLido());

        sc.close();
    }
}
