import java.util.Arrays;

public class LaczenieZadanka {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17};
        int[] array3 = new int[]{1, 2, 3};
        int[] array33 = new int[]{9, 10, 11};


        int[] array4 = new int[]{1, 4, 8, 9, 19};
        int[] array5 = new int[]{2, 3, 7, 10};

        System.out.println("dzielenie tablicy :");
        divArray(array);

        System.out.println("*******************************");

        System.out.println("laczenie tablicy o tej samej wielkosci : ");
        System.out.println(Arrays.toString(concatSameSizeArrayV2(array33, array3)));

        System.out.println("*******************************");

        System.out.println("laczenie tablicy o roznej wielkosci");
        System.out.println(Arrays.toString(concatDiffSizeArrayV1(array5, array3)));

        System.out.println("*******************************");

        System.out.println("laczenie 2 posortowanych tablice jednakowej wielkosci w 1 posortowana : ");
        System.out.println(Arrays.toString(concatSortSizeArray(array4, array5)));
    }


    public static void divArray(int[] array) {
        int mid = array.length / 2; // 7/2 = 3

        int[] left = new int[mid]; //3
        int[] right = new int[array.length - mid]; //7 - 3 = 4

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }


    public static void divArrayV2(int[] array) {
        int mid = array.length / 2; // 7/2 = 3

        int[] left = new int[mid]; //3
        int[] right = new int[array.length - mid]; //7 - 3 = 4

        for (int i = 0; i < array.length; i++) {
            if (i < mid) {
                left[i] = array[i];
            } else {
                right[i - mid] = array[i];
            }
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }

    public static int[] concatSameSizeArrayV1(int[] left, int[] right) {
        if (left.length != right.length) {
            return new int[0];
        }

        int[] result = new int[left.length + right.length];

        int dodatkowaZmienna = 0;
        for (int i = 0; i < result.length; i += 2) {
            result[i] = left[dodatkowaZmienna];
            result[i + 1] = right[dodatkowaZmienna];
            dodatkowaZmienna++;
        }

        return result;
    }

    public static int[] concatSameSizeArrayV2(int[] left, int[] right) {
        if (left.length != right.length) {
            return new int[0];
        }

        int[] result = new int[left.length + right.length];

        for (int i = 0; i < result.length; i += 2) {
            result[i] = left[i / 2];
            result[i + 1] = right[i / 2];
        }

        return result;
    }


    public static int[] concatSameSizeArrayV3(int[] left, int[] right) {
        if (left.length != right.length) {
            return new int[0];
        }

        int[] result = new int[left.length + right.length];

        for (int i = 0; i < left.length; i++) {
            result[2 * i] = left[i];
            result[2 * i + 1] = right[i];
        }

        return result;
    }


    public static int[] concatDiffSizeArrayV1(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftSize = left.length;
        int rightSize = right.length;

        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for (int i = 0; i < result.length; i += 2) {
            if (currentLeftIndex < leftSize && currentRightIndex < rightSize) {
                result[i] = left[currentLeftIndex];
                result[i + 1] = right[currentRightIndex];
                currentLeftIndex++;
                currentRightIndex++;
            } else if (currentLeftIndex >= leftSize) {
                result[i] = right[currentRightIndex];
                currentRightIndex++;
                if (currentRightIndex < rightSize) {
                    result[i + 1] = right[currentRightIndex];
                    currentRightIndex++;
                }
            } else {
                result[i] = left[currentLeftIndex];
                currentLeftIndex++;
                if (currentLeftIndex < leftSize) {
                    result[i + 1] = left[currentLeftIndex];
                    currentLeftIndex++;
                }
            }
        }

        return result;
    }


    public static int[] concatDiffSizeArrayV2(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftSize = left.length;
        int rightSize = right.length;

        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (currentLeftIndex < leftSize && currentRightIndex < rightSize) {
                result[i] = left[currentLeftIndex];
                i++;
                result[i] = right[currentRightIndex];

                currentLeftIndex++;
                currentRightIndex++;
            } else if (currentLeftIndex < leftSize) {
                result[i] = left[currentLeftIndex];
                currentLeftIndex++;
            } else {
                result[i] = right[currentRightIndex];
                currentRightIndex++;
            }
        }

        return result;
    }


    public static int[] concatSortSizeArray(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftSize = left.length;
        int rightSize = right.length;

        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (currentLeftIndex < leftSize && currentRightIndex < rightSize) {
                if (left[currentLeftIndex] <= right[currentRightIndex]) {
                    result[i] = left[currentLeftIndex];
                    currentLeftIndex++;
                } else {
                    result[i] = right[currentRightIndex];
                    currentRightIndex++;
                }
            } else if (currentLeftIndex < leftSize) {
                result[i] = left[currentLeftIndex];
                currentLeftIndex++;
            } else {
                result[i] = right[currentRightIndex];
                currentRightIndex++;
            }
        }

        return result;
    }
}
