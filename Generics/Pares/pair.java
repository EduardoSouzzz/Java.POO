public class Pair<A, B> {

    private A first;
    private B second;

    public Pair(A nome, B idade) {
        this.first = nome;
        this.second = idade;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public void setFirst(A f) {
        this.first = f;
    }
    public void setSecond(B s) {
        this.second = s;
    }
}
