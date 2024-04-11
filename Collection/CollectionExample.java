package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Cac phan tu cua ArrayList: " + arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Cac phan tu cua LinkedList: " + linkedList);
    }
}
