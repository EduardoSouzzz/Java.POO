public class LoginGoogle implements Autenticavel {

    private String tokenGoogle;

    public LoginGoogle(String tokenGoogle) {
        this.tokenGoogle = tokenGoogle;
    }

    public String getTokenGoogle() {
        return tokenGoogle;
    }

    public void setTokenGoogle(String tokenGoogle) {
        this.tokenGoogle = tokenGoogle;
    }

    @Override
    public Boolean autenticar(String usuario, String senha) {
        // verifica se existe um token válido.
        return tokenGoogle != null && !tokenGoogle.isEmpty();
    }
}
