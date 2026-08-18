void main() {

    Cliente cliente = new Cliente(50L, "Zé", "zedsilva98@gmail.com",  "123456");
    ClienteDTO clienteDTO = new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getEmail());

    System.out.println(clienteDTO);
}
