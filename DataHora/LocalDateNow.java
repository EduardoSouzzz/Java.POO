import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MC8 {
    public static void main(String[] args) {

        LocalDate diaDehJ = LocalDate.now();

        DateTimeFormatter day = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Hoje é: " + day.format(diaDehJ));
    }
}
