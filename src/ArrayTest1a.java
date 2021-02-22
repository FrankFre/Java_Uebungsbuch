import java.util.Arrays;

public class ArrayTest1a {


        //eindimensoinale D. primitiver Datentyp
        static int[] test1 = new int[3];
        // Initialisierung des Arrays

        //mehrdimensoinale D. primitiver Datentyp
        int[][] test11;

        int[] test5 = new int[4];
        int[][] test55 = new int[4][5];

        static int[] test2 =  {1, 2, 3, 4};
        static int[][] test22 = {{1, 2, 3, 4}, {1, 2, 3, 4}};

        String[] test3 =  {"Anton", "Berta", "Cäsar", "David"};
        String[][] test33 = {{"Anton", "Berta", "Cäsar", "David"}, {"Anton", "Berta", "Cäsar", "David"}};

        String[] test4 = new String[4];
        String[][] test44 = new String[4] [2];


        Object[] test6 = new Object[3];
        Object[] []test66 = new Object[3][2];

        Object[] test7 = {test3, test4, test2};
        Object[][] test77 = {{test3, test4, test2}, {test3, test4, test2}};


    public static void main(String[] args) {

        //Augabe der Array- Inhalte
        System.out.println(test1.toString());
   /*     anzeigen(test2);

        anzeigen2(test22);*/

    }

   /* private static void anzeigen(int[] test2) {
        System.out.println(Arrays.toString(test2));
    }

    private static void anzeigen2(int[][] test3) {
        System.out.println(Arrays.toString(test3));
    }*/

}
