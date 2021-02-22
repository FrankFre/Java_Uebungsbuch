import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class ArrayTest1 {

    private static int[] a = new int[3];
    private static int[][] x = new int[2][3];

    //Alternative Deklaration
    //private int a[] = new int [3];
    //private int b[][] = new int[2][3];
    //private static int[][] x = new int[2][3];

    //Klassenmethode für die Anzeige eines 2-dimensionalen Arrays
    public static void anzeige(int[][] x) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) 
                System.out.print(x[i][j] + " ");
                //Zeilenumbruch
                System.out.println();
            }
            System.out.println();
    }
    
        public static void main(String[] args) {
        //Eindimensionale Arrays initialisieren
        int[] y = new int[3];
        for (int i = 0; i < 3; i++)
            y[i] = 1;
        //Kompakte Initioalisierung für Array-Elemente während der Laufzeit
        int[] z = {2, 2, 2};

        //Initialisierung mit einem konstanten Wert mit fill
        Arrays.fill(a, 7);
        System.out.println("Eindimensionales Array mit primitiven Datentypen");

        System.out.println(Arrays.toString(a));

        Array.setInt(a, 0, 6);
        Array.setInt(a, 1, 6);
        Array.setInt(a, 2, 6);
        Integer integer = (Integer) Array.get(a, 0);

        //den Wert des Wrapper-Objekts ermitteln
        int n = integer.intValue();
        System.out.println(a[0] + " " + a[1] + " " + a[2] + "**" + n);

        //zweidimensionale Arrays über eindimensionales Array erzeugen
        System.out.println("Zweidimensionale Arrays sind Arrays von eindimensionalen Arrays");

            for (int i = 0; i < 2; i++) {
            x[i] = new int []{9, 9, 9};

            //Mit der Methode toString() der Klasse Arrays die
            //eindimensionalen Arrays anzeigen
            System.out.print(Arrays.toString(x[i]));
            System.out.println();
        }
        System.out.println("Zweidimensionale Arrays von primitiven Datentypen");
        //Das so erzeugte zweidimensionale Array ausgeben
        anzeige(x);
        x = new int[][]{{1, 1, 1}, {2, 2, 2}};
        anzeige(x);
        x = new int[][]{y, z};
        anzeige(x);


        //dynamisches Erzeugen mit der Methode newInstance() der Klasse Array
        int c[] = {2};
        Object array = Array.newInstance(int.class, c);
        Array.setInt(array, 0, 4);
        Array.setInt(array, 1, 4);
        System.out.println("Eindimensionales Array von primitiven Datentypen");
        System.out.println(Array.getInt(array, 1));

        Vektor[] v = new Vektor[2];
        Vektor[][] w = new Vektor[2][2];

        System.out.println("Eindimensionales Array vom TYp der Klasse Vektor");

        for (int i = 0; i < 2; i++) {
            v[i] = new Vektor(1, 2, 3);
        }

        v[0].anzeige();
        v[1].anzeige();

        System.out.println();
        System.out.println("Zweidimensionales Array vom Typ der Klasse Vektor");
        for (int i = 0; i < 2; i++) {
            w[i][0] = new Vektor(1, 2, 3);
            w[i][1] = new Vektor(4, 5, 6);
        }

        for (int i = 0; i < 2; i++) {
            w[i][0].anzeige();
            w[i][1].anzeige();
        }
    }
}

