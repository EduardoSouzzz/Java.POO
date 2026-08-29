import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Conta> contas = new ArrayList<>();

    public void tranferir(Long idOrigem, Long idDestino, double valor) {

        Conta origem = null;
        Conta destino = null;

        // procurar as duas contas
        for (Conta conta : contas) {
            if (conta.getId().equals(idOrigem)) {
                origem = conta;
            }
            if (conta.getId().equals(idDestino)) {
                destino = conta;
            }
        }
        // verifica se encontrou
        if (origem == null) {
            throw new IllegalArgumentException("Conta de origem não encontrada.");
        }

        if (destino == null) {
            throw new IllegalArgumentException("Conta de destino não encontrada.");
        }

        // validar valor
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor é zero, Impossivel transferir.");
        }
        // verificar saldo
        if (origem.getSaldo() < valor) {
            throw new IllegalArgumentException("Impossivel transferir, saldo insuficiente.");
        }
        double origemSaldo = origem.getSaldo();
        double destinoSaldo = destino.getSaldo();

        // retirar da origem
        origem.setSaldo(origemSaldo -= valor);
        // add ao destino
        destino.setSaldo(destinoSaldo += valor);

    }
}
