package quadrat_110221;

public class PunktTest {

    public static void main(String[] args) {

        Punkt koor = new Punkt(3, 4);
        koor.koor_anzeigen();
        koor.setX(7);
        koor.setY(8);
//        koor.koor_anzeigen();
        System.out.println("x = " + koor.getX());

    }
}
