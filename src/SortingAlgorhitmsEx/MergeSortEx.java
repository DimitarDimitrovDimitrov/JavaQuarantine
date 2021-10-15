package SortingAlgorhitmsEx;

import java.util.Arrays;
import java.util.Random;

public class MergeSortEx {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[100];

        Arrays.setAll(numbers, i -> random.nextInt(100));

        long time1 = System.nanoTime();
        System.out.println("Before: " + time1);
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\n" + "After: " + "\n");
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);
        printArray(numbers);

    }

    private static void mergeSort(int[] inputArray) {

        int inputLength = inputArray.length;
        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        System.arraycopy(inputArray, 0, leftHalf, 0, midIndex);

        if (inputLength - midIndex >= 0)
            System.arraycopy(inputArray, midIndex, rightHalf, midIndex - midIndex, inputLength - midIndex);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {

            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {

                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {

            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {

            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));

    }
}
