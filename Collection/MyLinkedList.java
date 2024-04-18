package Collection;
public class MyLinkedList {

    public static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null){
                    System.out.print(" -> ");
                }else{
                    System.out.println();
                }
            }
        }
    }
    public static Node addToHead(Node headNode, int value){
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }
    public static Node addToTail(Node headNode, int value){
        Node newNode = new Node(value);
        if(headNode == null){
            return newNode;
        }else{
            //B1: Xac dinh Last Node
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            //B2: Gan next cho lastNode = newNode
            lastNode.next = newNode;
        }
        return headNode;
    }
    public static Node addToIndex(Node headNode, int value, int index){
        if(index == 0){
            return addToHead(headNode, value);
        }else{
            //B1: Tim vi tri can them
            Node newNode = new Node(value);
            Node currentNode = headNode;
            int count = 0;
            while (currentNode != null) {
                count++;
                if(count == index){
                    //Thuc hien add
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        return headNode;
    }
    public static Node removeAtHead(Node headNode){
        if(headNode != null){
            return headNode.next;
        }
        return headNode;
    }
    public static Node removeAtTail(Node headNode){
        if(headNode == null){
            return null;
        }
        //B1: Xac dinh Last va previous
        Node lastNode = headNode;
        Node prevNode = null;

        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if(prevNode != null){
            prevNode.next = lastNode.next;
        }
        return headNode;        
    }
    public static Node removeAtIndex(Node headNode, int index){
        if(headNode == null || index < 0){
            return null;
        }
        if(index == 0){
            removeAtHead(headNode);
        }
        Node curNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean Isfound = false;
        while (curNode.next != null) {
            if(count == index){
                //Remove curNode
                Isfound = true;
                break;
            }
            prevNode = curNode;
            curNode = curNode.next;
            count++;
        }
        if (Isfound) {
            if(prevNode == null){ //CurrentNode is LastNode
                return null;
            }else{
                if (curNode != null) {
                    prevNode.next = curNode.next;
                }
            }
        }
        return headNode;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        printLinkedList(n1);
        Node newList = addToTail(n1, 4);
        printLinkedList(newList);
        Node newList2 = addToHead(n1, 0);
        printLinkedList(newList2);
        Node newList3 = addToIndex(n1, 5, 4);
        printLinkedList(newList3);
        Node newList4 = removeAtHead(n1);
        printLinkedList(newList4);
        Node newList5 = removeAtTail(n1);
        printLinkedList(newList5); //Xoa di phan tu "5"
        Node newList6 = removeAtIndex(n1, 1);
        printLinkedList(newList6);
    }
}
