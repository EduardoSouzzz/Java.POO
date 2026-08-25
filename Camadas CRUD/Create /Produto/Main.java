
void main() {

    Produto produto = new Produto("Teclado", 200.00, 65);
    Service service = new Service();

    System.out.println(service.cadastroProduto(produto));

}
