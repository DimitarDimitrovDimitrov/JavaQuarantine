package arrayEx;

import java.util.Arrays;

public class AddToArray {

    public static int[] addX(int n, int[] arr, int x) {
        int i;

        // we need to create a new array of size n+1
        int[] newarr = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements until n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

    public static void main(String[] args) {

        int n = 10;
        int i;

        // the initial size is 10
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // print the original array
        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));

        // element to be added
        int x = 25;

        arr = addX(n, arr, x);

        // print the updated array
        System.out.println("\nArray with " + x
                + " added:\n"
                + Arrays.toString(arr));
    }

}

