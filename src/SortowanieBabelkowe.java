import java.util.Arrays;
import java.util.List;

public class SortowanieBabelkowe implements SortingAlgorithm{

    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] result = Arrays.copyOf(input, input.length);

        for (int i = 0; i <= result.length - 2; i++) {
            for (int j = 0; j <= result.length - 2 - i; j++) {
                if (result[j] > result[j + 1]) {
                    swap(result, j, j + 1);
                }
            }
        }
        return result;
    }

    private void swap(Integer[] array, int a, int b) {
        int zmienna = array[a];
        array[a] = array[b];
        array[b] = zmienna;
    }
}