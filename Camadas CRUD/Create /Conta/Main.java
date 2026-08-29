void main() {

    Conta origem = new Conta(90L, "Zé", 200.00);
    Conta destino = new Conta(32L, "Juca", 100.00);

    Service service = new Service();
    service.contas.add(origem);
    service.contas.add(destino);

    service.tranferir(90L, 32L, 40);
    System.out.println(origem.getSaldo());
    System.out.println(destino.getSaldo());
}
