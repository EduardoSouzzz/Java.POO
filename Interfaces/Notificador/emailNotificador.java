public class EmailNotificador implements Notificador{

    private String emailOrigem;

    public EmailNotificador(String emailOrigem) {
        this.emailOrigem = emailOrigem;
    }

    public String getEmailOrigem() {
        return emailOrigem;
    }

    public void setEmailOrigem(String emailOrigem) {
        this.emailOrigem = emailOrigem;
    }

    @Override
    public void enviar(String msg) {
        System.out.println("EMAIL:" + emailOrigem + " A mensagens para você! toque para ver.");
    }
}
