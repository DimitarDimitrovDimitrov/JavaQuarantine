package listEx;

import java.util.ArrayList;
import java.util.List;

public class ListExMain {
    public static void main(String[] args) {
        //Array and ArrayList comparison

        String[] arrayOfNames = new String[3];  //Arrays have fixed size. They can't automatically scale.

        arrayOfNames[0] = "Alf";
        arrayOfNames[1] = "Sparrow";
        arrayOfNames[2] = "Jack";

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Anne");
        listOfNames.add("Michael");
        listOfNames.add("John");
        listOfNames.add("Arron");

        System.out.println(listOfNames.get(0));

    }
}
