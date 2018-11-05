public class MinWTablicy {

    private static void minimum(int[] tab) {
        int min=tab[0];

        for (int i=0;i<tab.length;i++) {
            if (tab[i]<min){
                min=tab[i];
            }
        }
        System.out.println("min : "+min);
    }

    private static int minimumZakres(int[] array,int a, int b) {
        if (a <= b && a < array.length && b < array.length && a >=0 && b >= 0) {

            int minIndex = a;

            for (int i = a; i <= b; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            return minIndex;
        }
        return -1;
    }

    public static void main(String[] args) {
//        int [] tab = new int[]{4,14,5,3};
//        minimum(tab);

        int[] array = new int[]{5, 9, 3, 1, 15};
        int minIndexFromAToB = MinWTablicy.minimumZakres(array, 0, 2);
        System.out.println("From A to B. Min value: " + array[minIndexFromAToB] + " at index: " + minIndexFromAToB);
    }



}
