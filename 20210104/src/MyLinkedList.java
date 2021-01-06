import java.util.*;

//结点类
class Node{
    public int data;
    public Node next;
    public Node(){
        //默认空构造函数
    }
    public Node(int data){
        //数据域自由赋值的构造函数
        this.data=data;
    }
}
//单链表类
public class MyLinkedList {
    public Node head;  //成员变量默认值是null

    //创建单链表
    public void createLinked() {
        this.head = new Node(20);
        Node node1 = new Node(30);
        this.head.next = node1;
        Node node2 = new Node(40);
        node1.next = node2;
        Node node3 = new Node(50);
        node2.next = node3;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //找到最后一个结点
    public Node findLastNode() {
        Node cur = this.head;
        if (this.head == null) {
            System.out.println("head为空结点！");
            return null;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找到倒数第二个结点
    public Node findLastTwoNode() {
        Node cur = this.head;
        if (this.head == null) {
            System.out.println("head为空结点！");
            return null;
        }
        if (this.head.next == null) {
            System.out.println("只有一个结点！");
            return null;
        }
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找到第n个结点
    public Node findN(int n) {
        Node cur = this.head;
        if (this.head == null) {
            System.out.println("head为空结点！");
            return null;
        }
        if (n <= 0 || n > this.size()) {
            System.out.println("查找位置不合法！");
            return null;
        }
        int count = 1;
        while (count != n) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //求链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //判断链表中是否含有key值
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur.data != key) {
            cur = cur.next;
            if (cur == null) {
                return false;
            }
        }
        return true;
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (this.head == null) {
            this.head = node;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //将当前结点指向index-1处的结点
    public Node moveIndex(int index) {
        Node cur = this.head;
        int count = 0;     //头结点下标为0
        while (count != index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //在下标index处插入结点，头结点下标为0
    public void addIndex(int index, int data) {
        if (index < 0 || index > this.size()) {
            System.out.println("插入位置不合法！");
            return;
        }
        if (index == 0) {
            addFirst(data);
        }
        if (index == this.size()) {
            addLast(data);
        }
        Node cur = moveIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        Node cur = this.head;
        if (this.head == null) {      //头结点为空
            return;
        }
        if (this.head.data == key) {    //删除头结点
            this.head = this.head.next;
        }
        while (cur.next != null) {
            if (cur.next.data == key) {     //找到关键字
                cur.next = cur.next.next;
                System.out.println("已删除");
                return;
            }
            cur = cur.next;
        }
        System.out.println("没找到关键字，删除失败！");
        return;
    }

    //删除所有出现的关键字key
    public void removeAllKey(int key) {
        Node cur = this.head.next;     //cur代表要删除的结点
        Node prev = this.head;
        while (cur != null) {          //此循环跳过了头结点
            if (cur.data == key) {           //找到data=key的结点
                prev.next = cur.next;
            } else {                 //没找到，都向后移
                prev = cur;
            }
            cur = cur.next;
        }
        if (this.head.data == key) {     //待遍历删除所有节点后，再判断头结点
            this.head = this.head.next;
        }
    }

    //
    public void clear() {
        this.head = null;
        System.out.println("链表已清除！");
    }

    //链表逆置
//    public Node reveseList() {
//        Node cur = this.head;
//        Node pre = null;
//        Node newHead = null;
//        while (cur != null) {
//            Node curNext = cur.next;
//            if (curNext == null) {
//                newHead = cur;
//            }
//            cur.next = pre;
//            pre = cur;
//            cur = curNext;
//        }
//        return newHead;
//    }
    public Node reveseList() {   //头插法逆置
        Node cur = this.head;
        Node pre = null;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return pre;
    }

    //求一个链表的中间结点，如果有偶数个结点，返回中间的第二个结点
//    public Node MiddleNode() {   //借助链表长度求
//        int len = size() / 2;
//        Node cur = this.head;
//        int count = 0;
//        while (count != len) {
//            cur = cur.next;
//            count++;
//        }
//        return cur;
//    }
    //返回链表的中间结点，如果有偶数个结点，返回中间的第二个结点
    public Node MiddleNode() {
        Node fast=this.head;
        Node slow=this.head;
        while (fast.next != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //找到链表中倒数第k个结点
    public Node FindKthToTail(int k){
        if(this.head==null||k<=0){
            return null;
        }
        Node fast=this.head;
        Node slow=this.head;
        for(int i=1;i<k;i++){
            fast=fast.next;
            if(fast==null){
                return null;
            }
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }


}
