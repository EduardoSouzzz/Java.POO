import java.util.HashMap;
import java.util.Map;

public class SistemaLogin {

    private Map<String, String> users = new HashMap<>();

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean login(String email, String password) {
        String savePassword = users.get(email);

        if (savePassword == null) {
            return false;
        }
        users.put(email, password);
        return savePassword.equals(password);
    }

    public void listUsers() {
        for (String email : users.keySet()) {
            System.out.println("EMAIL: " + email);
        }
    }
}
