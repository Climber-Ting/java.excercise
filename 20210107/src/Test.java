import java.util.*;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList list1=new DoubleLinkedList();
        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
        list1.addFirst(4);
        list1.addFirst(5);
        list1.addLast(7);
        list1.addLast(6);
        list1.addIndex(3,0);
        list1.display();
    }
}
