package forEachEx;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        list.forEach(System.out::println);

        for (String i : list) {
            System.out.println(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

    }
}
