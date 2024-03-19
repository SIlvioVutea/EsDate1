import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Main {
    //    Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//    Formatta la data ottenuta in FULL, MEDIUM e SHORT
//    Stampa le varie versioni
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String fullFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dateTime);
        System.out.println(fullFormat);

        String mediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dateTime);
        System.out.println(mediumFormat);

        String shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dateTime);
        System.out.println(shortFormat);
    }
}