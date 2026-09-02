import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Cliente> clientes = new ArrayList<>();
    List<Quarto> quartos = new ArrayList<>();

    public double reservarQuarto(Long idCliente, Long idQuarto, int quantidadeDias) {

        // 1. validar quantidade de dias
        if (quantidadeDias <= 0) {
            throw new IllegalArgumentException("Quantidade de dias deve ser positivo");
        }

        // 2. encontrar cliente
        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        // 3. verificar se cliente existe
        if (clienteEncontrado == null) {
            throw new IllegalArgumentException("Cliente nao encontrado");
        }

        // 4. verificar se cliente está ativo
        if (!clienteEncontrado.isAtivo()) {
            throw new IllegalArgumentException("Cliente NÃO está ativo");
        }

        // 5. encontrar quarto
        Quarto quartoEncontrado = null;

        for (Quarto quarto : quartos) {
            if (quarto.getId().equals(idQuarto)) {
                quartoEncontrado = quarto;
                break;
            }
        }

        // 6. verificar se quarto existe
        if (quartoEncontrado == null) {
            throw new IllegalArgumentException("Quarto não encontrado");
        }

        // 7. verificar se quarto está disponivel
        if (!quartoEncontrado.isDisponivel()) {
            throw new IllegalArgumentException("Quarto NÃO está ativo no momento.");
        }

        // 8. calcular valor total da reserva
        double precoDiaria = quartoEncontrado.getPrecoDiaria();
        double valorTotal = precoDiaria * quantidadeDias;

        // 9. marcar quarto como indisponível
        quartoEncontrado.setDisponivel(false);

        // 10. retornar valor total
        return valorTotal;
    }
}
