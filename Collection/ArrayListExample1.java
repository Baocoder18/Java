package Collection;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListExample1 {
    //Show list through Iterator
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ",");
        }
            
        //Show list through for-each
        System.out.println();
        for (String obj : list) {
            System.out.println(obj + ",");
        }

        //Show list through index
        System.out.println();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i) + ",");
        }
    }
}
