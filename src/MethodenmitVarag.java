public class MethodenmitVarag {
    // Methode mit einer variablen Anzahl von Argumenten
    public static void varArg(char... c) {
        System.out.println("1 Anzahl der variablen Argumente: " + c.length);
        System.out.println("1 Werte der variablen Argumente: ");
        for (char x : c) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    //Überladen der Methode, in dem der Typ der Parameter abgeändert wird
    public static void varArg(boolean... c) {
        System.out.println("2 Anzahl der variablen Argumente: " + c.length);
        System.out.print("2 Werte der variablen Argumente: ");
        for (boolean x : c) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    // Überladen der Methode, indem die Parameterliste erweitert wird
    public static void varArg(int i1, int i2, boolean ... c ) {
        System.out.println("3 Anzahl der variablen Argumente: " + c.length);
        System.out.print("3 Werte der variablen Argumente: ");
        for (boolean x : c) {
            System.out.print(x + " ");
            System.out.println();
            System.out.println("Werte der klassischen Argumente: " + i1 + " " + i2);
        }
    }

    public static void main(String[] args) {
    //Methodenaufrufe mit unterschiedlicher Anzahl von Argumenten
    varArg('a');
    varArg('a', 'b', 'c');
    varArg(false);
    varArg(false, true);
    varArg(1, 2, false, true);
    varArg(1, 2, true);
    }
}
