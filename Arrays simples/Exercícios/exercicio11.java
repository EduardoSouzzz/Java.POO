void main() {

    int[] numeros = {20, 63, 52, 100, 89};
    int soma = 0;
    int par = 0;
    int impar = 0;

    for (int n : numeros) {
        if (n % 2 == 0) {
            par++;
        } else {
            impar++;
            soma += n;
        }
    }
    System.out.println(soma);
}
