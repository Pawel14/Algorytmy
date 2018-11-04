public class CiagFibonaciego {

    private static int fibonaci(int index){
        if(index == 0){
            System.out.println("zero");
            return 0;
        }else if(index == 1){
            System.out.println("jeden");
            return 1;
        }
        return fibonaci(index-1) +
                fibonaci(index-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonaci(0));
        System.out.println(fibonaci(1));
        System.out.println(fibonaci(2));
        System.out.println(fibonaci(3));

    }
}
