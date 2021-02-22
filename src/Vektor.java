public class Vektor {

        private int x;
        private int y;
        private int z;

        // parameterloser Konstruktor
        public Vektor() {
            this(0, 0, 0);
        }

        //Besitzen Methoden- und KOnstruktorenparameter die gleichen NAmen wie die Instanzfelder, dann müssen diese
        //über this angesprochen werden
        public Vektor(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // ein über den Copy Konstruktor erzeugtes Objekt hat die gleichen Feldwerte wie das übergebene
        public Vektor(Vektor v2) {
            x = v2.x;
            y = v2.y;
            z = v2.z;
            System.out.println("Test1");
        }


        // Methodendefinitionen
        public Vektor neu(int a, int b, int c) {
            this.x = + a;
            this.y = + b;
            this.z = + c;
            return this;
        }

        public Vektor neu(Vektor v) {
            x = x + v.x;
            y = y + v.y;
            z = z + v.z;
            return this;
        }

        //neuer Methodenname neu1
        public Vektor neu1(int a, int b, int c) {
            Vektor vektor = new Vektor();
            vektor.x =x + a;
            vektor.y =y + b;
            vektor.z =z + c;
            return vektor;
        }

        public void anzeige() {
            System.out.println("Parameter der Koordinate X:" + getX() + " Y:" + getY() + " Z:" + getZ());
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }

}
