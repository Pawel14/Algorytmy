import java.util.Random;

public class WypisywanieDoPodanejLiczby {

    private static int srodkowyElement(int indeks) {
        int[] tab = new int[10];
//        int id=0;
//        for (int i = 0; i < (indeks+1); i++) {
//            int los = new Random().nextInt(10);
//            tab[i] = los;
//
//            id++;
//            System.out.println("indeks " + (id-1) +": "+los);
//        }
        int id=indeks;
        for (int i = indeks; i < tab.length; i++) {
            int los = new Random().nextInt(10);
            tab[i] = los;

            id++;
            System.out.println("indeks " + (id-1) +": "+los);
        }
        return indeks;
    }
        public static void main(String[] args) {
        new WypisywanieDoPodanejLiczby().srodkowyElement(3);
    }
}
