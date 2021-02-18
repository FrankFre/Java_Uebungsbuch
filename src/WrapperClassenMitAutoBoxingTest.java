public class WrapperClassenMitAutoBoxingTest {

    public static void main(String[] args) {

        //Objekt der Klasse erzeugen
        WrapperKlassemitAutoBoxing  wrapper = new WrapperKlassemitAutoBoxing
                ((byte)1,2, '3', (short)4,(long)5,(float)1.0,2.0,true);
        System.out.println("Basistypwerte der Wrapper-Objekte");

        //und ihre Methoden aufrufen
        wrapper.objectTonumber();

        System.out.println("Auto(un)boxing in Methoden-aufrufen und " + "-rueckgaben: ");
        System.out.println((wrapper.konvert(true)));
//        System.out.println(wrapper.einBoolean);

        System.out.println("Typumwandungen in einem Ausdruck:");
        wrapper.rechnen(1, 2.0);

        System.out.println("Unboxing in Kontrollanweisungen");
        wrapper.vergleichen(1, 2);

        //Anstelle des mit deprecated gekennzeichneten Konstruktors kann die Klassenmethode Integer.valueOf() aufgerufen werden
        //in dieser Zeile ist ein Bug
        wrapper.vergleichen(Integer.valueOf(1), Integer.valueOf(1));

        Integer zahl1 = Integer.valueOf(1);
        Integer zahl2 = zahl1;
        wrapper.vergleichen(zahl1, zahl2);

    }
}
