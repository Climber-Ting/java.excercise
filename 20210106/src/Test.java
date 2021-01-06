import java.util.*;
public class Test {
    public static void main(String[] args) {
        NodeList list1=new NodeList();
        NodeList list2=new NodeList();
        list1.created();
        list1.display();
//        list1.head=list1.reverse();
//        list1.display();
//        list1.head=list1.delete(30);
//        list1.display();
//        System.out.println(list1.middleNode().data);
        System.out.println(list1.KthToLast(2).data);
        list1.head=list1.partition(30);
        list1.display();
    }
}
