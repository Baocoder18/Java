package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionExample2 {
    //new TreeSet se sap xep cac phan tu
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Cac phan tu cua Set: " + hashSet);
    //new TreeMap() se sap xep cac phan tu dua vao key cua chung
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Language1", "Java");
        hashMap.put("Language2", ".Net");
        System.out.println("Cac phan tu Map: " + hashMap);
    }
}
