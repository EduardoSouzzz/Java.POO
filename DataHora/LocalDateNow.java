import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MC8 {
    public static void main(String[] args) {

        LocalDate diaDehJ = LocalDate.now();

        DateTimeFormatter day = DateTimeFormatter.ofPattern("08/07/2025");
        System.out.println("Hoje é: " + day.format(diaDehJ));
    }
}
