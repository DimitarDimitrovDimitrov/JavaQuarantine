package ListsEx;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListComparison {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        //In case we know the amount of elements we are going to have, we can set up initial size of our ArrayList
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        final Long startTimeLL = System.nanoTime();
        linkedList.remove(5000000);
        final Long endTimeLL = System.nanoTime();

        final Long startTimeAl = System.nanoTime();
        arrayList.remove(5000000);
        final Long endTimeAl = System.nanoTime();

        long totalTimeLL = endTimeLL - startTimeLL;
        long totalTimeAL = endTimeAl - startTimeAl;

        System.out.println("Total time Linked list " + totalTimeLL);
        System.out.println("Total time Array List " + totalTimeAL);
    }
}
