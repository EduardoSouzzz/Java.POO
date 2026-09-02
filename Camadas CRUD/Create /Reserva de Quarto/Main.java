void main() {

    Service service = new Service();
    Cliente cliente = new Cliente(
            9L,
            "Zé",
            true
    );

    Quarto quarto = new Quarto(
            201L,
            5,
            150.00,
            true
    );
    service.clientes.add(cliente);
    service.quartos.add(quarto);

    double valoresTotais = service.reservarQuarto(9L, 201L, 4);
    System.out.println("Valor total: R$ " +  valoresTotais);
    System.out.println("Quarto disponível: " + quarto.isDisponivel());
}
