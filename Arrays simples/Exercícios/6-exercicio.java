void main() {

    int[] numeros = {2, 5, 7, 9, 11, 13};
    boolean encontrado = false;

    for (int n : numeros) {
        if (n == 7) {
            encontrado = true;
        }
    }
    System.out.println("Número 7 existe no array: " + encontrado);
}
