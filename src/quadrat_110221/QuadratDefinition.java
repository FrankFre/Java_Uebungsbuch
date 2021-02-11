package quadrat_110221;

public class QuadratDefinition {

    int a;

    //Konstruktordefinition
    QuadratDefinition(int i) {
        a = i;
    }

    // Instanzmethode zur Berechnung
    public int flaeche() {
        int f = a * a;
        return f;
    }

    //Gleichnamige Klassenmethode zur Berechnung
    public static int flaeche(QuadratDefinition q)  {
        int f = q.a * q.a;
        return f;
    }




}