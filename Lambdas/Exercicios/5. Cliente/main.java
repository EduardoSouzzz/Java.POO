
void main() {

    List<Cliente> clientes = List.of(
            new Cliente("Castro", "Jandira", 258.30),
            new Cliente("Ana", "Itupeva", 129.80),
            new Cliente("José", "Sorocaba", 26.00),
            new Cliente("Ireno", "Poços de Caldas", 764.40),
            new Cliente("Bryan", "São Paulo", 1000.00)
    );

    Optional<Cliente> clienteQueMaisComprou = clientes.stream()
            .max(Comparator.comparing(Cliente::getTotalCompras));
    System.out.println("Cliente que mais comprou: " + clienteQueMaisComprou);


    String nomes = clientes.stream()
            .map(Cliente::getNome)
            .collect(Collectors.joining("-"));
    System.out.println("Nomes dos clientes: " + nomes);

    Map<String, List<Cliente>> agruparPorCidade = clientes.stream()
            .collect(Collectors.groupingBy(Cliente::getCidade));
    System.out.println("Agrupamento por Cliente: " + agruparPorCidade);
}
