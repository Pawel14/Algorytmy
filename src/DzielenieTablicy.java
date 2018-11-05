import java.util.Arrays;

public class DzielenieTablicy {

    private static void dziel(int[] tab) {

        int mid = tab.length / 2;
        int[] tabLewa = new int[mid];
        int[] tabPrawa = new int[tab.length - mid];

        for (int c = 0; c < tabLewa.length; c++) {
            tabLewa[c] = tab[c];
        }

        for (int e = mid; e < tab.length; e++) {
                tabPrawa[e - mid] = tab[e];
            }
        System.out.println(Arrays.toString(tabLewa));
        System.out.println(Arrays.toString(tabPrawa));
        }


    private static int[] laczenieTablic(int[] tab2,int[] tab3){

        if(tab2.length != tab3.length){
            return new int[0];
        }
        int[] result= new int[tab2.length+tab3.length];

        for (int i=0; i<result.length;i+=2){
            result[i]=tab2[i/2];
            result[i+1]=tab3[i/2];

        }
        return result;
    }

    private static int[] nieparzysteLaczenieTablic(int[] tab22,int[] tab33){


        int[] result= new int[tab22.length+tab33.length];

        for (int i=0; i<result.length-1;i+=2){
            result[i]=tab22[i/2];
            result[i+1]=tab33[i/2];
            if(tab22.length<tab33.length){
            result[result.length-1]=tab33[tab33.length-1];
            }else{
                result[result.length-1]=tab22[tab22.length-1];
            }
        }

        return result;
    }

    private static int[] sortLaczenieTablic(int[] tab22){

        int[] result= new int[tab22.length];
        result=tab22;
        int c = tab22[0];

        for (int a=0; a<result.length-1;a++){

            if(tab22[a]>tab22[a+1]){
            tab22[a] = tab22[a+1];
            tab22[a+1] = c;
            }

        }
        return result;
    }
    private static int[] nieSortLaczenieTablic(int[] tab22,int[] tab33){


        int[] result= new int[tab22.length+tab33.length];

        for (int i=0; i<result.length-1;i+=2){
            result[i]=tab22[i/2];
            result[i+1]=tab33[i/2];
            if(tab22.length<tab33.length){
                result[result.length-1]=tab33[tab33.length-1];
            }else{
                result[result.length-1]=tab22[tab22.length-1];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("******zad.1******");
        int [] tab = new int[]{1,14,5,6,2};
        dziel(tab);
        System.out.println("******zad.2******");
        int [] tab2 = new int[]{1,4,5};
        int [] tab3 = new int[]{2,1,4};
        System.out.println(Arrays.toString(laczenieTablic(tab2, tab3)));
        System.out.println("*********zad.3*********");
        int [] tab4 = new int[]{5,1,12,8};
        int [] tab5 = new int[]{12,2,4};
        System.out.println(Arrays.toString(nieparzysteLaczenieTablic(tab4, tab5)));
        System.out.println("*********zad.4*********");
        int [] tab6 = new int[]{5,1,8,4};
        System.out.println(Arrays.toString(sortLaczenieTablic(tab6)));

    }
}
