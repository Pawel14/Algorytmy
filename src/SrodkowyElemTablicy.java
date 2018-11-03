import java.util.Random;
import java.util.Scanner;

public class SrodkowyElemTablicy {

    private static int srodkowyElement(int a){
        int [] tab = new int[a];
        for(int i=0;i<tab.length;i++){
            int los = new Random().nextInt(20);
            tab[i] = los;
            }

        if(a%2==0)
        {
            int j=a/2-1;
            System.out.println("indeks : "+j);
        }else{
            int j2=a/2;
            System.out.println("indeks : "+j2);
        }
    return a;
    }

    public static void main(String[] args) {
new SrodkowyElemTablicy().srodkowyElement(7);
    }
}
