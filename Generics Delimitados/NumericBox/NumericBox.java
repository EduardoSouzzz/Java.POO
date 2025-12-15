public class NumericBox<T extends Number > {

    private T valor;

    public NumericBox(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }

    public double doubleValue() {
        return valor.doubleValue();
    }

}
