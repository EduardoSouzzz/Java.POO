import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Cliente> clientes = new ArrayList<>();
    List<Conta> contas = new ArrayList<>();

    public void cadastrarConta(Long idCliente, Conta conta) {

        // 1. Verificar se o cliente existe.
        Cliente clienteExiste = null;

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                clienteExiste = cliente;
                break;
            }
        }
        if (clienteExiste == null) {
            throw new IllegalArgumentException("Cliente não encontrado");
        }

        // 2. Verificar se o cliente está ativo.
        if (!clienteExiste.isAtivo()) {
            throw new IllegalArgumentException("Cliente está INATIVO.");
        }

        // 3. Verificar se a conta não é null.
        if (conta == null) {
            throw new IllegalArgumentException("Conta inexistente.");
        }

        // 4. Verificar se o número da conta não está vazio.
        if (conta.getNumero() == null || conta.getNumero().isBlank()) {
            throw new IllegalArgumentException("Número da conta está vazio,");
        }

        // 5. Verificar se o saldo inicial é maior ou igual a 0.
        if (conta.getSaldo() < 0) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }

        // 6. Verificar se já existe uma conta com o mesmo número.
        for (Conta contaExistente : contas) {
            if (contaExistente.getNumero().equals(conta.getNumero())) {
                throw new IllegalArgumentException("Já existe uma conta com esse número.");
            }
        }

        // 7. Associar a conta ao cliente usando idCliente.
        conta.setIdCliente(idCliente);

        // 8. add a conta na lista
        contas.add(conta);
    }


    public Conta buscarConta(Long idConta) {

        Conta contaExiste = null;
        for (Conta conta : contas) {
            if (conta.getId().equals(idConta)) {
                contaExiste = conta;
                break;
            }
        }

        if (contaExiste == null) {
            throw new IllegalArgumentException("Conta inexistente.");
        }
        return contaExiste;
    }

    public void depositar(Long idConta, double valor) {

        // validar valor
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor negativo.");
        }

        // buscar conta pelo ID
        Conta conta = buscarConta(idConta);

        // verificar se está ativa
        if (!conta.isAtiva()) {
            throw new IllegalArgumentException("Conta está INATIVA.");
        }
        // add o valor ao saldo
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public void sacar(Long idConta, double valor) {

        // validar valor
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor negativo.");
        }
        // buscar conta pelo ID
        Conta conta = buscarConta(idConta);

        // verificar se conta está ativa
        if (!conta.isAtiva()) {
            throw new IllegalArgumentException("Conta inexistente.");
        }

        // verificar se existe saldo suficiente
        if (conta.getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        // subtrair o valor do saldo
        conta.setSaldo(conta.getSaldo() - valor);
    }



    public void encerrarConta(Long idCliente, Long idConta) {

        // 1. encontrar cliente pelo ID
        Cliente clienteExiste = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                clienteExiste = cliente;
                break;
            }
        }

        // 2. verificar se o cliente existe
        if (clienteExiste == null) {
            throw new IllegalArgumentException("Cliente inexistente.");
        }

        // 3. verificar se o cliente está ativo
        if (!clienteExiste.isAtivo()) {
            throw new IllegalArgumentException("Cliente está INATIVO.");
        }

        // 4. encontrar conta pelo ID
        Conta conta = buscarConta(idConta);

        // 6. Verificar se a conta pertence ao cliente informado.
        if (!conta.getIdCliente().equals(idCliente)) {
            throw new IllegalArgumentException("Conta não pertence ao cliente informado.");
        }

        // 7. verificar se conta está ativa
        if (!conta.isAtiva()) {
            throw new IllegalArgumentException("Conta está INATIVA.");
        }

        // 8. verificar se o saldo é exatamente 0
        if (conta.getSaldo() != 0) {
            throw new IllegalArgumentException("Não é possível encerrar uma conta com saldo.");
        }

        // 9. Se todas as regras forem satisfeitas, deixar a conta como inativa
        conta.setAtiva(false);

    }
}
