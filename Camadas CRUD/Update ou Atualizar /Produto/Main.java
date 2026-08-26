
void main() {

    Produto produto = new Produto(28L, "Fone Bluetooth", 79.50, 1797);

    Service service = new Service();
    service.produtos.add(produto);

    service.alterarEstoque(28L, 1765);
    System.out.println(produto);
}

