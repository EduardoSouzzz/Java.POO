void main() {

    int[] numeros = {-7, -9, -10, 6, 98, 252};
    int soma = 0;

    for (int n : numeros) {
        if (n < 0) {
            soma+=n;
        }
    }
    System.out.println(soma);
}
