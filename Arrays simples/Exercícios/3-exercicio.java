void main() {

    int[] numeros = {40, 90, 78, 128, 256, 10};
    int contador = 0;

    for (int n : numeros) {
        if (n > 50) {
            contador++;
        }
    }
    System.out.println("Números maior que 50: " + contador);
}
