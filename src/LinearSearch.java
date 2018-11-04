import java.util.List;

public abstract class LinearSearch<T extends Comparable<T>>
        implements SearchAlgorithm<T> {


    public Integer search(Integer value, List<T> input) {
        return null;
    }


    public Integer search(Integer value,T[] input) {

        for (int i=0;i<input.length;i++){
            if (input[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
}
