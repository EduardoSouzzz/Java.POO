import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Cliente> clientes = new ArrayList<>();

    public Cliente buscarPorId(long id) {

        for (Cliente c : clientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        throw new RuntimeException("Cliente não encontrado");
    }
}
