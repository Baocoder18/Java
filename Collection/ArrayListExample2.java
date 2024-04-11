package Collection;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");

        //addAll()
        ArrayList<String> listA = new ArrayList<>();
        listA.addAll(list);
        System.out.println("List A: ");
        showList(listA);

        //retainAll() listA 
        ArrayList<String> listB = new ArrayList<>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.println("List A: ");
        showList(listA);

        //removeAll() listA
        list.removeAll(listA);
        System.out.println("List A: ");
        showList(list);
    }
    public static void showList(ArrayList<String> list){
        for (String obj : list) {
            System.out.print("\t" + obj + ",");
        }
        System.out.println();
    }
}
