import java.util.List;

public class BinarySearchIter<T extends Comparable<T>>
        implements SearchAlgorithm<T> {
    @Override
    public Integer search(T value, List<T> input) {
        return null;
    }

    /**
     * BinarySearchIter(A[0..N-1], value)
     *     low = 0
     *     high = N - 1
     *     while low <= high
     *         mid = (low + high) / 2
     *         if A[mid] > value
     *             high = mid - 1
     *         else if A[mid] < value
     *             low = mid + 1
     *         else
     *             return mid
     *     return not_found
     */
    @Override
    public Integer search(T value, T[] input) {
        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (input[mid].compareTo(value) > 0) {
                high = mid - 1;
            } else if (input[mid].compareTo(value) < 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    public static void main(String[] args) {

        Integer []tab = new Integer[]{2,5,7,10,15};
       BinarySearchIter algorytmBinarny=new BinarySearchIter();
//        System.out.println(algorytmBinarny.search(2, tab));
//        SearchAlgorithm binaryRec = new AlgorytmBinarny();
//        int binaryRecResult = binaryRec.search(19,tab);
    }
}
