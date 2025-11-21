public class LoginGitHub implements Autenticavel {

    private String tokenGitHub;

    public LoginGitHub(String tokenGitHub) {
        this.tokenGitHub = tokenGitHub;
    }

    public String getTokenGitHub() {
        return tokenGitHub;
    }

    public void setTokenGitHub(String tokenGitHub) {
        this.tokenGitHub = tokenGitHub;
    }

    @Override
    public Boolean autenticar(String usuario, String senha) {
        // verifica se existe um token válido.
        return tokenGitHub != null && !tokenGitHub.isEmpty();
    }
}
