import java.util.List;

public interface SearchAlgorithm<T extends Comparable<T> > {
    Integer search(T value, List<T> input);
    Integer search(T value, T[] input);

    Integer search(Integer value, List<Integer> input);
}
