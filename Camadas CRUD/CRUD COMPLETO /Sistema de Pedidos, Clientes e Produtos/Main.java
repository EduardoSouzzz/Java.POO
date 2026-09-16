void main() {

    Service service = new Service();
    Cliente cliente1 = new Cliente(55L, "João", true);
    Cliente cliente2 = new Cliente(54L, "Maria", true);
    Cliente cliente3 = new Cliente(53L, "Carlos", true);

    Produto produto1 = new Produto(10L, "Teclado", 150.00, 10, true);
    Produto produto2 = new Produto(20L, "Mouse", 80.00, 20, true);
    Produto produto3 = new Produto(30L, "Monitor", 900.00, 5, false);

    service.clientes.add(cliente1);
    service.clientes.add(cliente2);
    service.clientes.add(cliente3);

    service.produtos.add(produto1);
    service.produtos.add(produto2);
    service.produtos.add(produto3);



    System.out.println("1. Criar pedido do João comprando 2 teclados");
    service.cadastrarPedido(55L, 10L, 2);
    System.out.println();


    System.out.println("2. Verificar estoque do teclado");
    System.out.println("Estoque do produto 1: " + produto1.getEstoque());
    System.out.println();


    System.out.println("3. Pagar pedido");
    service.pagarPedido(1L);
    System.out.println();


    System.out.println("4. Tentar cancelar pedido pago");
    try {
        service.cancelarPedido(1L);
    }  catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    System.out.println();


    System.out.println("5. Criar outro pedido da Maria comprando 3 mouses");
    service.cadastrarPedido(54L, 20L, 3);
    System.out.println();


    System.out.println("6. Tentar desativar o mouse");
    try {
        service.desativarProduto(20L);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    System.out.println();


    System.out.println("7. Cancelar o pedido da Maria");
    service.cancelarPedido(2L);
    System.out.println();


    System.out.println("8. Verificar se o estoque voltou");
    System.out.println("Estoque do produto 2: " + produto2.getEstoque());
    System.out.println();


    System.out.println("9. Desativar o mouse");
    service.desativarProduto(20L);
    System.out.println(produto2);
    System.out.println();


    System.out.println("10. Tentar criar pedido usando produto inativo");
    try {
        service.cadastrarPedido(53L, 30L, 4);
    }  catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    System.out.println();


    System.out.println("11. Tentar desativar João enquanto ele possui pedido pago");
    try {
        service.desativarCliente(55L);
    }  catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    System.out.println(service.buscarCliente(55L));
    System.out.println();


    System.out.println("12. Tentar desativar Maria depois que o pedido dela foi cancelado");
    try {
        service.desativarCliente(54L);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
    System.out.println(service.buscarCliente(54L));
}
