void main() {

    int[] numeros = {8, 2, 78, 128, 256, 5};
    int contador = 0;

       for (int n : numeros) {
           if (n < 10) {
               contador++;
           }
       }
       System.out.println("Números MENOR que 10: " + contador);

}
