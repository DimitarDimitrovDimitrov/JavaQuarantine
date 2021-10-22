package queueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

    public static void main(String[] args) {

        Queue<String> queueOfNames = new LinkedList<>();

        queueOfNames.add("Anton");
        queueOfNames.offer("Brian");
        queueOfNames.offer("Caitlyn");//Unlike the add method,OFFER doesn't throw exception if the queue is full

        queueOfNames.remove();// Removes the first added element
        queueOfNames.poll(); //Difference is unlike remove(), poll doesn't throw exception if the queue is empty

        for (String items : queueOfNames) {
            System.out.println(items);
        }
    }
}

