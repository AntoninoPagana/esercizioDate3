import java.time.OffsetDateTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        Integer anno = data.getYear();
        System.out.println("Anno: " + anno);

        String mese = String.valueOf(data.getMonth());
        System.out.println("Mese: " + mese);

        Integer giorno = data.getDayOfMonth();
        System.out.println("Giorno: " + giorno);

        String giornoDellaSettimana = String.valueOf(data.getDayOfWeek());
        System.out.println("Giorno della settimana: " + giornoDellaSettimana);
    }
}
