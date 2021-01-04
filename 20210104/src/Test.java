import java.util.*;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createLinked();
        myLinkedList.display();
        System.out.println(myLinkedList.size());
        myLinkedList.addLast(100);
        myLinkedList.addFirst(0);
        myLinkedList.display();
        System.out.println("倒数第二个节点是"+myLinkedList.findLastTwoNode().data);
        myLinkedList.addIndex(3,11);
        myLinkedList.display();
        System.out.println("第3个节点是" + myLinkedList.findN(3).data);
        myLinkedList.remove(1);
        myLinkedList.display();
        myLinkedList.remove(11);
        myLinkedList.display();
        myLinkedList.addFirst(50);
        myLinkedList.display();
        myLinkedList.removeAllKey(50);
        myLinkedList.display();
//        myLinkedList.clear();
//        myLinkedList.display();
        myLinkedList.head=myLinkedList.reveseList();
        myLinkedList.display();
    }
}
