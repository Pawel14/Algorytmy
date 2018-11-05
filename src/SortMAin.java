import java.util.Arrays;

public class SortMAin {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{3, 8, 1, 2, 9, 15, 11};

        SortingAlgorithm bubbleSort = new SortowanieBabelkowe();

        Integer[] bubbleSortResult = bubbleSort.sort(array);

        System.out.println("sortowanie babelkowe: " + Arrays.toString(bubbleSortResult));


    }
}
