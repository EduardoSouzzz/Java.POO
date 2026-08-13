void main() {
    int[] numeros = {63, 61, 50, 6, 98, 252};

    for (int n : numeros) {
        if (n % 2 == 0) {
            System.out.println(n);
            break; // para assim que encontra o primeiro
        }
    }
}
