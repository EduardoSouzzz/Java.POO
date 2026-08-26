
void main() {

    Cliente cliente = new Cliente(39L, "Zé", "ze@gmail.com", true);
    Service service = new Service();
    service.clientes.add(cliente);

    service.deletarCliente(cliente.getId());
    System.out.println(service.clientes);
}

