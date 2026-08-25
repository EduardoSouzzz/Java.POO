
void main() {

    Cliente clientes = new Cliente(45L, "bernardo", "be2013@gmail.com", true);
    Service service = new Service();

    service.clientes.add(clientes);
    System.out.println(service.buscarPorId(clientes.getId()));
}
