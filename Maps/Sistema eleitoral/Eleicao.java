import java.util.HashMap;
import java.util.Map;

public class Eleicao {

    private Map<String, Candidato> candidatos = new HashMap<>();

   public void cadastrarCandidato(Candidato candidato) {
       candidatos.put(candidato.getNome(), candidato);
   }

   public void votar(String nomeCandidato) {
       Candidato c = candidatos.get(nomeCandidato);

       if (c != null) {
           c.votar();
       } else {
           System.out.println("Candidato não encontrado.");
       }
   }

    public void mostrarResultado() {
        for (Candidato c : candidatos.values()) {
            System.out.println(
                    c.getNome() + " (" + c.getPartido() + ") - " +
                            c.getVotos() + " votos"
            );
        }
    }

   public Candidato candidatoVencedor() {
       Candidato vencedor = null;

       for (Candidato c : candidatos.values()) {
           if (vencedor == null || c.getVotos() > vencedor.getVotos()) {
               vencedor = c;
           }
       }
       return vencedor;
   }

}
