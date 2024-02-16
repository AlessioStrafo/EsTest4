//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Ottieni l'anno
//Ottieni il mese
//Ottieni il giorno
//Ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio

import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime dataString = getParse(data);
        String dataAnno = getYyyy(dataString);
        System.out.println(dataAnno);
        String dataMese = getMmmm(dataString);
        System.out.println(dataMese);
        String dataGiorno = getDd(dataString);
        System.out.println(dataGiorno);
        DayOfWeek day = getDayOfWeek(dataString);
        System.out.println(day);
    }
    static OffsetDateTime getParse(String data) {
        return OffsetDateTime.parse(data);
    }

    private static DayOfWeek getDayOfWeek(OffsetDateTime dataString) {
        return dataString.getDayOfWeek();
    }
    private static String getDd(OffsetDateTime dataString) {
        return dataString.format(DateTimeFormatter.ofPattern("dd"));
    }
    private static String getMmmm(OffsetDateTime dataString) {
        return dataString.format(DateTimeFormatter.ofPattern("MMMM"));
    }
    private static String getYyyy(OffsetDateTime dataString) {
        return dataString.format(DateTimeFormatter.ofPattern("yyyy"));
    }

}