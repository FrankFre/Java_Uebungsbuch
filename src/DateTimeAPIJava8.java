import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class DateTimeAPIJava8 {

    public static void main(String[] args) {

        // Uhr als Taktgeber für Zeitklassen
        Clock clock = Clock.system(ZoneId.systemDefault());
        System.out.println("Clock: " + clock.toString());

        //frühere Methode
        System.out.println("Aktuelle Zeit mit currentTimeMillis(): " + System.currentTimeMillis());
        System.out.println("Aktuelle Zeit mit clock: " + clock.millis());

        //Methode now() der neuen java.time.Instant-Klasse
        Instant now = Instant.now();
        System.out.println("now() vom Instant: " + now);

        //Berechnung des Alters einer Person
        Instant geb2019 = Instant.parse("2019-12-22T00:00:00Z");
        Instant geb1949 = Instant.parse("1949-12-22T00:00:00Z");
        
        Duration altermitDuration = Duration.between(geb1949, geb2019);

        System.out.println("Geburtstag 1949: " + geb1949);
        System.out.println("Geburtstag 2019: " + geb2019);
        System.out.println(altermitDuration);
        System.out.println("Alter mit Duration in Tagen: " + altermitDuration.toDays());



    }



}
