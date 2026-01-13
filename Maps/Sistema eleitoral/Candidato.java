public class Candidato {

    private String nome;
    private String partido;
    private int votos;

    public Candidato(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;
        this.votos = 0;
    }

    public void votar() {
        votos++;
    }
    public int getVotos() {
        return votos;
    }
    public String getNome() {
        return nome;
    }
    public String getPartido() {
        return partido;
    }

    @Override
    public String toString() {
        return nome + " (" + partido + ") - " + votos + " votos";
    }

}
