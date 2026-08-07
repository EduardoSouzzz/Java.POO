
void main() {

    List<Pedido> pedido = List.of(
            new Pedido(34L, "José", 467.00, Status.PENDENTE),
            new Pedido(21L, "lão", 721.00, Status.PAGO),
            new Pedido(98L, "Zézé", 200.00, Status.PAGO),
            new Pedido(56L, "nessa", 142.00, Status.CANCELADO)
    );

    List<Pedido> pedidos_PAGO = pedido.stream()
            .filter(p -> p.getStatus() == Status.PAGO)
            .toList();
    System.out.println("Pedidos pago: " + pedidos_PAGO);


    double somaValorTotal = pedido.stream()
            .filter(p -> p.getStatus() == Status.PAGO)
            .mapToDouble(ped -> ped.getValorTotal())
            .sum();
    System.out.println(somaValorTotal);


    List<Pedido> combinacao = pedido.stream()
            .filter(ped -> ped.getValorTotal() > 100 && ped.getStatus() == Status.PAGO)
            .toList();
    System.out.println(combinacao);
}
