void main() {

    String[] nomes = {"Zé", "Idem", "Geladeira", "Misto Quente", "Melão"};
    int cont = 0;

    for (String n : nomes) {
        if (n.contains("M")) {
            cont++;
        }
    }
    System.out.println(cont);
}
