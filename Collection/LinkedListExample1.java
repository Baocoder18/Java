package Collection;
import java.util.Iterator; 
import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("PHP");
        linkedList.add("Java");
    // Show list through Iterator 
    Iterator<String> itr = linkedList.iterator();
    while (itr.hasNext()) {
        System.out.print(itr.next() + ", ");
    }
    // add first 
    linkedList.addFirst("Python");
    // Show list through for-each
    System.out.println();
        for (String obj : linkedList) {
        System.out.print(obj +", ");
    }
    // add last 
    linkedList.addLast("Ruby");
    // Show list through index 
    System.out.println();
    int size = linkedList.size(); for
    (int i = 0; i < size; i++) {
    System.out.print(linkedList.get(i) + ", ");
        }   
    }
}
