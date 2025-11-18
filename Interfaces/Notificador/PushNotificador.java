public class PushNotificador implements Notificador {

    private String tokenDispositivo;

    public PushNotificador(String tokenDispositivo) {
        this.tokenDispositivo = tokenDispositivo;
    }

    public String getTokenDispositivo() {
        return tokenDispositivo;
    }

    public void setTokenDispositivo(String tokenDispositivo) {
        this.tokenDispositivo = tokenDispositivo;
    }

    @Override
    public void enviar(String msg) {
        System.out.println(tokenDispositivo + " A mensagens para você!");
    }
}
