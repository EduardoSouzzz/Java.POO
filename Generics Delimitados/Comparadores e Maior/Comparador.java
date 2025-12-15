public class Comparador <T extends Comparable<T>>{

    private T a;
    private T b;

    public Comparador(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }
    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T maior() {
        if (a.compareTo(b) > 0) {
            return a;
        }
        return b;
    }

    public int compareTo() {
       return a.compareTo(b);
    }
}
