import java.util.*;

//结点类
class Node{
    public int data;
    public Node next;
    public Node(){
        //默认空构造函数
    }
    public Node(int data){
        //数据域赋值的构造函数
        this.data=data;
    }
}
//单链表类
public class MyLinkedList {
    public Node head;  //成员变量默认值是null
    //创建单链表
    public void createLinked() {
        this.head=new Node(20);
        Node node1=new Node(30);
        this.head.next=node1;
        Node node2=new Node(40);
        node1.next=node2;
        Node node3=new Node(50);
        node2.next=node3;

    }
    //打印单链表
    public void display() {
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
//    //找到最后一个结点
//    public Node findLastNode() {
//
//    }
//    //找到倒数第二个结点
//    public Node findLastTwoNode() {
//
//    }
//    //找到第n个结点
//    public Node findN(int n) {
//
//    }
//    //求链表的长度
//    public int size(){
//
//    }
//    //判断链表中是否含有key值
//    public boolean contains(int key) {
//
//    }
//    //头插法
//    public void addFirst(int data) {
//
//    }
//    //尾插法
//    public void addLast(int data) {
//
//    }
//
//    public Node moveIndex(int index) {
//
//    }
//    //在下标index处插入结点
//    public void addIndex(int index,int data) {
//
//    }
}
