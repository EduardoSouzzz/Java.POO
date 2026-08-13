void main() {

    int[] numeros = {-7, -9, -10, 6, 98, 252};
    int cont = 0;

        for (int n : numeros) {
            if (n < 0) {
                cont++;
            }
        }
        System.out.println(cont);
    }
