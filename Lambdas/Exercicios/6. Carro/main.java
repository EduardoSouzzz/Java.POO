
void main() {

    List<Carro> carros = List.of(
            new Carro("SUV", "Chevrolet", 2022, 75600.00),
            new Carro("Picape", "Fiat", 2015, 30200.00),
            new Carro("Hatch", "Volkswagen", 2023, 60400.00),
            new Carro("SUV", "Chevrolet", 2026, 168900.00),
            new Carro("Sedã", "Toyota", 2026, 200000.00),
            new Carro("Esportivo", "Porsche", 2025, 1215000.00),
            new Carro("Eletrico", "BYD", 2026, 90000.00)
    );

    List<Carro> carrosOrdenados = carros.stream()
            .sorted(Comparator.comparing(Carro::getPreco).reversed())
            .toList();
    System.out.println(carros);

    Optional<Carro> carroMaisBarato = carros.stream()
            .min(Comparator.comparing(Carro::getPreco));
    System.out.println("Carro mais barato: " + carroMaisBarato);

    List<String> marcasSemRept = carros.stream()
            .map(Carro::getMarca)
            .distinct()
            .toList();
    System.out.println("Marcas dos carros sem repetição: " + marcasSemRept);
}
