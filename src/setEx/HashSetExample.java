package setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //Set initialization
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(123);

        Iterator<Integer> itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        /** Another more readable way is using foreach
         * Also uses Iterator under the hood
         * for (int i : set1){
         *  System.out.println(i);
         *  }
         */
    }
}
