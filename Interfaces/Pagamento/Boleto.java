public class Boleto implements Pagamento{

    private String codigoDeBarras;

    public Boleto(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento Concluido com Sucesso!");
    }

    @Override
    public String emitirComprovante() {
        return "=== COMPROVANTE DE PAGAMENTO ===\n" +
                "Codigo " + codigoDeBarras + "\n" +
                "====================================";
    }
}
