package referenzen_150221;

import quadrat_110221.Punkt;

public class GlobaleReferenzen {
    //Globale primitive und Referenzvariablen
    private static int i = 1;
    private int[] iarray = {1, 2, 3}; //Ref..
    private Punkt p = new Punkt(4.0, 3.0);
    private static Punkt[] parray = {
            new Punkt(1.0, 1.0), new Punkt(2.0, 2.0)};


    //Methodendefinitionen
    public void methode1() {
        i = 0;
        iarray[i] = 0;
    }

    //Das Objekt, auf das die Referenz zeigt, wird abgeändert
    public void methode2() {
        p.setX(0.0);
        p.setY(0.0);
        parray[i].setX(0.0);
        parray[i].setY(0.0);


    }

    //Die Referenz wird abgeändert
    public void methode3() {
        p = new Punkt(-1.0, -1.0);


    }


    public static void main(String[] args) {

//        Objekt der Klasse erzeugen

        GlobaleReferenzen instanz = new GlobaleReferenzen();
        System.out.println("int-Variable vor dem Aufruf von" + "methode1(): " + i);
        System.out.println("int-Array vor dem Aufruf von" + "methode1(): " + i);
        for (int j = 0; j < instanz.iarray.length; j++) {
            System.out.println(instanz.iarray[j] + " ");
        }
        System.out.println();
        instanz.methode1();

        System.out.println("int-Variable nach dem Aufruf von" + "methode1(): " + i);
        System.out.println("int-Array nach dem Aufruf von" + "methode1(): ");

        for (int j = 0; j < instanz.iarray.length; j++) {
            System.out.println(instanz.iarray[j] + " ");

        }
        System.out.println();


    }
}
