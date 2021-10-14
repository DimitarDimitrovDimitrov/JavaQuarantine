package MapsEx;

import java.util.HashMap;
import java.util.Map;

public class MapsEx {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Karen", 54321);
        empIds.put("Jerry", 87654);

        System.out.println(empIds);

        empIds.put("Jerry", 11111);//If there is a key Jerry already present, we will update its value
        empIds.putIfAbsent("Jerry", 23456);//Will do nothing if Jerry key is already present
        empIds.replace("John", 56789);// If John is not present in the Map, replace will not replace its value

        for (Map.Entry<String, Integer> entry : empIds.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }

    }


}
