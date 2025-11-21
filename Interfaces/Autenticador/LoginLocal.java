public class LoginLocal implements Autenticavel {

    private String usuarioCadastrado;
    private String senhaCadastrada;

    public LoginLocal(String usuarioCadastrado, String senhaCadastrada) {
        this.usuarioCadastrado = usuarioCadastrado;
        this.senhaCadastrada = senhaCadastrada;
    }

    public String getUsuarioCadastrado() {
        return usuarioCadastrado;
    }

    public void setUsuarioCadastrado(String usuarioCadastrado) {
        this.usuarioCadastrado = usuarioCadastrado;
    }

    public String getSenhaCadastrada() {
        return senhaCadastrada;
    }

    public void setSenhaCadastrada(String senhaCadastrada) {
        this.senhaCadastrada = senhaCadastrada;
    }

    @Override
    public Boolean autenticar(String usuario, String senha) {
        return this.usuarioCadastrado.equals(usuario)
                && this.senhaCadastrada.equals(senha);
    }
}
