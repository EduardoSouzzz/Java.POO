import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Cliente> clientes =  new ArrayList<>();
    List<Conta> contas = new ArrayList<>();

    public void tranferir(Long idCliente, Long idContaOrigem, Long idContaDestino, double valor) {

        // 1. validar valor
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor é negativo");
        }

        // 2. encontrar cliente
        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        // 3. verificar se existe
        if (clienteEncontrado == null) {
            throw new IllegalArgumentException("Cliente NÃO encontrado.");
        }

        // 4. verificar se cliente está ativo no sistema
        if (!clienteEncontrado.isAtivo()) {
            throw new IllegalArgumentException("Cliente está INATIVO(A).");
        }

        // 5. encontrar contra origem
        Conta contaOrigemExiste = null;

        for (Conta conta : contas) {
            if (conta.getId().equals(idContaOrigem)) {
                contaOrigemExiste = conta;
                break;
            }
        }

        // 6. verificar se conta origem existe
        if (contaOrigemExiste == null) {
            throw new IllegalArgumentException("Conta origem NÃO encontrada.");
        }

        // 7. verificar se conta origem está ativa
        if (!contaOrigemExiste.isAtiva()) {
            throw new IllegalArgumentException("Conta origem está INATIVA.");
        }

        // 8.
        Conta contaDestinoExiste = null;

        for (Conta conta : contas) {
            if (conta.getId().equals(idContaDestino)) {
                contaDestinoExiste = conta;
                break;
            }
        }

        // 9. verificar se conta destino existe
        if (contaDestinoExiste == null) {
            throw new IllegalArgumentException("Conta destino NÃO encontrada.");
        }

        // 10. verificar se conta destino existe
        if (!contaDestinoExiste.isAtiva()) {
            throw new IllegalArgumentException("Conta destino está INATIVA.");
        }

        // 11. verificar se as contas são diferentes
        if (contaOrigemExiste.equals(contaDestinoExiste)) {
            throw new IllegalArgumentException("Conta origem é IGUAL a conta destino, " +
                    "impossivel realizar transferencias.");
        }

        // 12. verificar saldo conta origem
        if (contaOrigemExiste.getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        // 13. retirar valor da conta origem
        double saldoOrigem = contaOrigemExiste.getSaldo();
        double retiradaOrigem = saldoOrigem -= valor;
        contaOrigemExiste.setSaldo(retiradaOrigem);

        // 14. add valor na conta destino
        double saldoDestino = contaDestinoExiste.getSaldo();
        double depositoDestino = saldoDestino += valor;
        contaDestinoExiste.setSaldo(depositoDestino);

    }
}
