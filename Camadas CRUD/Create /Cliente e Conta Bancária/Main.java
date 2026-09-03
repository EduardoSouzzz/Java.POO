
void main() {

    Service service = new Service();
    Cliente cliente = new Cliente(
            32L,
            "Zé",
            true
    );

    Conta contaOrigem = new Conta(
            15L,
            "12345",
            1000.00,
            true
    );

    Conta contaDestino = new Conta(
            27L,
            "6789",
            500.00,
            true
    );

    service.clientes.add(cliente);
    service.contas.add(contaOrigem);
    service.contas.add(contaDestino);

    service.tranferir(32L, 15L, 27L, 300);

    System.out.println("Conta origem: " + contaOrigem.getSaldo());
    System.out.println("Conta destino: " + contaDestino.getSaldo());
}
