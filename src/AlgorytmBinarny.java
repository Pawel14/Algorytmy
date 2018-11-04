import java.util.List;

public abstract class AlgorytmBinarny <T extends Comparable<T> > implements SearchAlgorithm{

    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Integer[] input) {

//        int low = 0;
//        int high = input.length-1;
//
//        while (low <= high){
//            int mid = (low + high) /2;
//            if (input[mid] > value) {
//                high = mid + 1;
//            }else if (input[mid] < value){
//                low = mid + 1;
//            }else
//                return mid;
//        }
//        return -1;
        return searchRec(value, input, 0, input.length-1);
    }

    private Integer searchRec (Integer value, Integer[] input, int low, int high){
        if (high < low ){
            return -1;
        }
        int mid = (low + high) /2;
        if (input[mid] > mid){
        return searchRec(value, input, low, mid-1);
        }else if(input[mid] < value){
            return searchRec(value, input, mid+1, high);
        }else{
            return mid;
        }
    }
    public static void main(String[] args) {

        Integer []tab = new Integer[]{2,5,7,10,15};
        AlgorytmBinarny algorytmBinarny=new AlgorytmBinarny();
//        System.out.println(algorytmBinarny.search(2, tab));
//        SearchAlgorithm binaryRec = new AlgorytmBinarny();
//        int binaryRecResult = binaryRec.search(19,tab);
        System.out.println(algorytmBinarny.searchRec(10, tab,0,15));
    }
}
