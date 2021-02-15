package vektor_120221;

import java.util.Vector;

public class VektorTest {

    public static void main(String[] args) {

        //Konstruktoren
        Vektor v1 = new Vektor();
        v1.anzeigeKoor();

        Vektor v2 = new Vektor(1,1,1);
        v2.anzeigeKoor();

        Vektor v3 = new Vektor(v2);
        v3.anzeigeKoor();


//        Erzeugen des neuen Vektor Objekts durch Veränderung des aufrufenden Objekts
        Vektor vneu = v1.neu(2,2,2);   //v1 wird "überschrieben" vneu hat gleiche Parameter
        v1.anzeigeKoor();
        vneu.anzeigeKoor();

//        oder
        v1 = new Vektor();      //parameterloser Const.
        Vektor vcopy = v1.neu(new Vektor(3,3,3));  //vcopy wird "überschrieben", vcopy hat gleiche Paramete
        v1. anzeigeKoor();
        vcopy.anzeigeKoor();


        //Erzeugen eines neuen Vektor -Objekts durch Beibehalten des aufrufenden Objekts
        System.out.println();
        v1 = new Vektor();   //parameterlos
        Vektor vneu1 = v1.neu1(4,4,4);  //Achtung, spezifischer Construktor deklariert !
        v1. anzeigeKoor();
        vneu1.anzeigeKoor();


    }

}
