public class SmsNotificador implements Notificador{

    private String numeroRemetente;

    public SmsNotificador(String numeroRemetente) {
        this.numeroRemetente = numeroRemetente;
    }

    public String getNumeroRemetente() {
        return numeroRemetente;
    }

    public void setNumeroRemetente(String numeroRemetente) {
        this.numeroRemetente = numeroRemetente;
    }

    @Override
    public void enviar(String msg) {
        System.out.println("Número: " + numeroRemetente + " A mensagens de SMS para você!");
    }
}
