package PracticeStudent;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        //Display
        System.out.println(hashMap);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        System.out.println(treeMap);

//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//        LinkedHashMap.put("Smith", 30);
//        LinkedHashMap.put("Anderson", 31);
//        LinkedHashMap.put("Lewis", 29);
//        LinkedHashMap.put("Cook", 29);
    }


}
