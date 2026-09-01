
void main() {

    Service service = new Service();
    Cliente cliente = new Cliente(
            10L,
            "Zé",
            true
    );

    Evento evento =  new Evento(
            50L,
            "Festival de Música",
            80.00,
            100
    );
    service.clientes.add(cliente);
    service.eventos.add(evento);

    double valor = service.comprarIngresso(10L, 50L, 4);
    System.out.println("Valor total: R$ " + valor);
    System.out.println("Ingressos restantes: " + evento.getIngrDisponiveis());
}

