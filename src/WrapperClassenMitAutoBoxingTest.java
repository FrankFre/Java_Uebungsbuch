public class WrapperClassenMitAutoBoxingTest {

    public static void main(String[] args) {

        //Objekt der Klasse erzeugen
        WrapperKlassemitAutoBoxing  wrapper = new WrapperKlassemitAutoBoxing
                ((byte)1,2, '3', (short)4, (long)5,(float)1.0,2.0,true);
        System.out.println("Basistypwerte der Wrapper-Objekte");

        //und ihre Methoden aufrufen
        wrapper.objectTonumber();






    }



}
