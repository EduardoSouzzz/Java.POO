public class Cartao implements Pagamento {

    private int numero;
    private String titular;
    private String validade;
    private double valor;

    public Cartao(int numero, String titular, String validade, double valor) {
        this.numero = numero;
        this.titular = titular;
        this.validade = validade;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento Concluido com Sucesso!");
    }

    @Override
    public String emitirComprovante() {
        return "=== COMPROVANTE DE PAGAMENTO ===\n" +
                "Método: Cartão\n" +
                "Titular: " + titular + "\n" +
                "Valor: R$ " + String.format("%.2f", valor) + "\n" +
                "Validade do Cartão: " + validade + "\n" +
                "================================";
    }
}
