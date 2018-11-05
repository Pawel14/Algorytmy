public class SortowanieZbioru {


    public static void sort(Integer[] tab) {
        int min = tab[0];
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] < min) {
                    min = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = min;
                }
            }
        }
    }

    public static void main(String[] args) {

        Integer[] tab2 = new Integer[]{3,5,4,1,8,2};
        sort(tab2);
        for (int zamiana:tab2) {
            System.out.println(zamiana);
        }


    }


}
