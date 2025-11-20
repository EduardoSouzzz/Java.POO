import java.util.ArrayList;
import java.util.List;

public class RelatorioClientes implements Relatorio{

    private List<Cliente> clientes = new ArrayList<>();

    public RelatorioClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addClientes(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String gerar() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO CLIENTES === \n");
        sb.append("--------------------------------\n");

        for (Cliente c : clientes) {
            sb.append("Nome: ")
                    .append(c.getNome())
                    .append("\n")
                    .append("Email: ")
                    .append(c.getEmail())
                    .append("\n");
        }
           return sb.toString();
    }
}
