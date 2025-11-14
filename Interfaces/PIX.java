public class Pix implements Pagamento{

    private int chave;
    private double valor;
    private String email;
    private int CPF;

    public Pix(int chave, double valor, String email, int CPF) {
        this.chave = chave;
        this.valor = valor;
        this.email = email;
        this.CPF = CPF;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento Realizado Com Sucesso!");
    }

    @Override
    public String emitirComprovante() {
        return "=== COMPROVANTE DE PAGAMENTO ===\n" +
                "Método: Pix\n" +
                "Chave: " + chave + "\n" +
                "CPF: " + CPF + "\n" +
                "Email: " + email + "\n" +
                "Valor: R$ " + String.format("%.2f", valor) + "\n" +
                "=================================";
    }
}

