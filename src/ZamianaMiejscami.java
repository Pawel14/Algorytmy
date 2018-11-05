public class ZamianaMiejscami {

    private static void zamianaMiejscami(int[] tab, int i, int i1) {
        int a = tab[i];
        tab[i] = tab[i1];
        tab[i1] = a;
    }

    private void wartosciWrazZIndeksami(int[] tab2) {

        for(int i=0;i<tab2.length;i++){
            System.out.println("indeks "+ i +" : " + tab2[i]);
        }
    }

    private void dlugoscIleElementow(int[] tab3) {

        for(int j=0;j<tab3.length;j++){
        for(int i=0;i<tab3.length;i++){
            System.out.print( i +":" + tab3[i]+", ");
            if (i != tab3.length-1){
                System.out.print(",");
            }
        }
            System.out.println();
    }
    }

    private static void oJedenElemPrzesun(int[] tab4) {

        for(int j=0;j<tab4.length;j++){
            if( j>=1){
                zamianaMiejscami(tab4,j-1,j);
            }
            for(int i=0;i<tab4.length;i++){
                System.out.print( i +":" + tab4[i]);
                if (i != tab4.length-1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int [] tab = new int[]{1,14,5,124,125};
//        zamianaMiejscami(tab , 1, 3);
//        for (int zamiana:tab) {
//            System.out.println(zamiana);
//        }
//        int [] tab2 = new int[]{1,14,5,124,125};
//        wartosciWrazZIndeksami(tab2);

//        int [] tab3 = new int[]{1,14,5};
//        dlugoscIleElementow(tab3);

        int [] tab4 = new int[]{1,14,5};
        oJedenElemPrzesun(tab4);
    }
}
