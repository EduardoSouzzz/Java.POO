void main() {

    int[] numeros = {20, 40, 60, 80, 100, 120};
    boolean encontrado = false;

    for (int n : numeros) {
        if (n == 100) {
            encontrado = true;
        }
    }
    System.out.println(encontrado);
}
