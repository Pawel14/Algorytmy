public class Main {
    public static void main(String[] args) {

        Integer[] array= new Integer[]{9,12,3,6,19,10};
        SearchAlgorithm searchAlgorithm = new LinearSearch();

        int result = searchAlgorithm.search(1,array);

        System.out.println(result);
    }
}
