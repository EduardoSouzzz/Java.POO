import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MC8 {
    public static void main(String[] args) {

        LocalTime horaLocal = LocalTime.now();
        DateTimeFormatter Hora1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora Local = " + horaLocal.format(Hora1));

    }
}
