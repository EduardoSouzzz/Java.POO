import java.util.*;

public class Agenda {

    private Map<String, List<String>> contatos = new HashMap<>();

    public void addContato(String nome, String telefone) {
        contatos.put(nome, new ArrayList<>(List.of(telefone)));
    }

    public void removerContato(String nome) {
        contatos.remove(nome);
    }

    public void listContatos() {
        for (String c : contatos.keySet()) {
            System.out.println("Contatos: " + c);
        }
    }
}
