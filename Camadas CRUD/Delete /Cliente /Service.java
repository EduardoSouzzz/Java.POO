import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Cliente> clientes  = new ArrayList<>();

    public void deletarCliente (Long id) {
        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado == null) {
            throw new RuntimeException("Cliente não encontrado");
        }
        clientes.remove(clienteEncontrado);
    }

}
