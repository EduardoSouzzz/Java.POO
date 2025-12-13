public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Pair<String, Integer>> nomes = new ArrayList<>();

        System.out.print("Digite quantos nomes você vai registrar: ");
        int qntNomes = sc.nextInt();

        for (int i = 1; i <= qntNomes; i++) {
            System.out.print("Digite o nome " + i + ": ");
            String nome = sc.next();

            System.out.print("Digite a idade " + i + ": ");
            int idade = sc.nextInt();
            System.out.println();
            Pair<String, Integer> pair = new Pair<>(nome, idade);
            nomes.add(pair);

        }
        System.out.println("Nomes e idades registrados:");
        for (Pair<String, Integer> pair : nomes) {
            System.out.println(pair.getFirst() + " | " + pair.getSecond());
        }
        sc.close();
    }
}
