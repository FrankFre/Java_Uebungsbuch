public class WrapperKlassemitAutoBoxing {

    //Globale Referenzen von Typ der Hüllenklassen
    Boolean einBoolean;
    private Character einCharacter;

    private Byte einByte;
    private Short einShort;
    private Integer einInteger;
    private Long einLong;
    private Float einFloat;
    private Double einDouble;

    //Konstruktordefinitionen
    WrapperKlassemitAutoBoxing(byte by, int i, char c, short s, long l, float f, double d, boolean bo) {
        //Instanzen der Hüllklassen erzeugen

        einByte = by;
        einBoolean = bo;
        einCharacter = c;
        einShort = s;
        einInteger = i;
        einFloat = f;
        einLong = l;
        einDouble = d;
    }

    // Lieferung des Basistyp-Werts eines Wrapper-Objekts über Unboxing
    public void objectTonumber() {
        System.out.println(" " + einByte);
        System.out.println(" " + einInteger);
        System.out.println(" " + einLong);
        System.out.println(" " + einShort);
        System.out.println(" " + einFloat);
        System.out.println(" " + einDouble);
        System.out.println(" " + einCharacter);
        System.out.println(" " + einBoolean);
        System.out.println();
    }

    // Das Autoboxing macht möglich, das der Methodenaufruf über konvert(boolean) erfolgen kann
    public boolean konvert(Boolean a) {
        // Unboxing vom Wrapper-Typ Boolean zum primitiven DAtentyp boolean
        return a;
    }

    // Beispiele von Typumwandlungen in einem Ausdruck
    public void rechnen(float zahl1, double zahl2) {
        //Die Werte von primitiven Datentypen werden eingehüllt
        Float zahlFloat = zahl1;
        Double zahlDouble = zahl2;

        //Zum rechnen entkapselt und als Ergebnis wieder eingehüllt
        Double ergebnis = zahlFloat * zahlDouble + zahlFloat / zahlDouble;
        System.out.println("Wert von Inkrementieren: " + ergebnis);

        //Das Wrapper-Objekt Ergebnis wird entkapselt, der gewonnene Wert inkrementiert und wieder eingehüllt
        ergebnis++;
        System.out.println("Wert nach Inkrementieren: " + ergebnis);
        System.out.print(
                "Ausdruck von Typ Integer in einer for-Schleife "
        );
        for (Integer i = 0; i <= 2; i++) {
            System.out.print(i + " ");
            System.out.println();
        }
    }

    //Unboxing mit Kontrollanweisungen
    public void vergleichen(Integer zahl1Integer, Integer zahl2Integer) {

        //Unboxing von Wrapper-Objekten
        int zahl1 = zahl1Integer;
        int zahl2 = zahl2Integer;

        // Vergleichen von Referenzen
        if (zahl1Integer == zahl2Integer) {
            System.out.println("Gleiche Referenzen");

            //Vergleich von primitiven Datentypen
            if (zahl1 == zahl2)
                System.out.println(" und gleiche Werte");
            else
                System.out.println(" und verschiedene Werte");
        } else {
            System.out.println("Verschiedene Referenzen");
            if (zahl1 == zahl2)
                System.out.println(" und gleiche Werte");
            else
                System.out.println(" und verschiedene Werte");

        }

    }}



