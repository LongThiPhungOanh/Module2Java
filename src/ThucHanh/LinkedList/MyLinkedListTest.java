package ThucHanh.LinkedList;
import ThucHanh.LinkedList.MyLinkedListTest;
public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("-----------Testing-------------");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.add(4,9);
        myLinkedList.add(4,9);
        myLinkedList.printList();
    }
 }

