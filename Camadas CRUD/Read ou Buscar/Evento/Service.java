import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Cliente>  clientes = new ArrayList<>();
    List<Evento> eventos = new ArrayList<>();

    public double comprarIngresso(Long idCliente, Long idEvento, int quantidade) {

        // validar quantidade
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero");
        }

        // encontrar cliente
        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado == null) {
            throw new IllegalArgumentException("Cliente nao encontrado");
        }

        // verificar cliente ativo
        if (!clienteEncontrado.isAtivo()) {
            throw new IllegalArgumentException("O cliente está inativo");
        }


        // encontrar evento
        Evento eventoEncontrado = null;
        for (Evento evento : eventos) {
            if (evento.getId().equals(idEvento)) {
                eventoEncontrado = evento;
                break;
            }
        }
        if (eventoEncontrado == null) {
            throw new IllegalArgumentException("Evento nao encontrado");
        }

        // verificar ingressos disponiveis
        if (eventoEncontrado.getIngrDisponiveis() < quantidade) {
            throw new IllegalArgumentException("A quantidade de ingressos são insuficiente");
        }

        // calcular valor total
        double valorTotal = eventoEncontrado.getPreco() * quantidade;

        // diminuir ingressos disponiveis
        int ingressosRestantes =
                eventoEncontrado.getIngrDisponiveis() - quantidade;
        eventoEncontrado.setIngrDisponiveis(ingressosRestantes);

        // retornar valor total
        return valorTotal;

    }
}
