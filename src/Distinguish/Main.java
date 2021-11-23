package Distinguish;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Tú Anh");
        hashMap.put(2, "Thảo");
        hashMap.put(3, "Lâm");
        hashMap.put(4, "Tùng");
        System.out.println(hashMap);
        HashSet<Student> hashSet = new HashSet<>();
        Student std1 = new Student("Tú Anh", 18, "Quảng Ninh");
        Student std2 = new Student("Thảo", 18, "Sài Gòn");
        Student std3 = new Student("Thảo", 18, "Quảng Ninh");
        Student std4 = new Student("Tùng", 20, "Hà Nội");

//        Student std6 = null;
        hashSet.add(std1);
        hashSet.add(std2);
        hashSet.add(std3);
        hashSet.add(std4);

//        hashSet.add(std6);
        for (Student element : hashSet) {
            System.out.println(element.toString());
        }
    }
}
