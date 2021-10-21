package SortingAlgorhitmsEx;

import java.util.Arrays;
import java.util.Random;

public class QuickSortEx {

    public static void main(String[] args) {

        Random random = new Random();

        long time1 = System.nanoTime();
        System.out.println("Before" + time1);
        int[] array = new int[100000000];
        Arrays.setAll(array, i -> random.nextInt(100000000));
        quickSort(array, 500000000, array.length - 1);

        long time2 = System.nanoTime();
        System.out.println("AFTER");
        System.out.println(time2 - time1);
    }

    private static void quickSort(int[] array, int start, int end) {

        if (end <= start) return; //base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}