package quadrat_110221;

public class QuadratDefinitionMain {

    public static void main(String[] args) {

        System.out.println("Instanz der Klasse erzeugen");
        QuadratDefinition quadrat = new QuadratDefinition(4);

        System.out.println("Aufruf der Instanzmethode");
        int finst = quadrat.flaeche(); //instanz . methode !!
        System.out.println("Flaeche: " + finst);

        System.out.println("Aufruf der Klassenmethode");
        int fkls2 = QuadratDefinition.flaeche(quadrat);//Klasse . methode
        System.out.printf("Flaeche: " + fkls2);

    }
}
