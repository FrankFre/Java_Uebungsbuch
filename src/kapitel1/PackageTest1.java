package kapitel1;

import paket1.Klasse1;
import kapitel1.paket2.Klasse2;


public class PackageTest1 {

    public static void main(String[] args) {

        Klasse1 kls1 = new Klasse1();
        Klasse2 kls2 = new Klasse2();

        System.out.println(Klasse1.oeffentlichesFeld);

    }



}
