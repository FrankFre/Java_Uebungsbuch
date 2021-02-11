package quadrat_110221;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Punkt {

    private double x;
    private double y;

    //Konstruktordefinition
    Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Instanzmethode
    public void koor_anzeigen() {
          System.out.println("Koordinate des Punkts: x = " + x + "  y = " + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
