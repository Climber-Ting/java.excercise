import java.util.*;

class Node{
    int data;
    Node next;
    public Node(){

    }
    public Node(int data){
        this.data=data;
    }
}

public class NodeList {
    Node head;

    public void created() {
        this.head = new Node(30);
        Node node1 = new Node(30);
        this.head.next = node1;
        Node node2 = new Node(10);
        node1.next = node2;
        Node node3 = new Node(40);
        node2.next = node3;
        Node node4 = new Node(30);
        node3.next = node4;
    }

    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //链表逆置
    public Node reverse() {
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

    //删除链表中等于给定值 val 的所有节点
    public Node delete(int val) {
        if (head == null) {
            return null;
        }
        while (this.head.data == val) {
            this.head = this.head.next;
        }
        Node cur = this.head.next;
        Node pre = this.head;
        while (cur != null) {
            if (cur.data == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return this.head;
    }

    //返回链表的中间结点
    public Node middleNode() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //计算链表长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //返回链表中倒数第k个结点
    public Node KthToLast(int k) {
        if (head == null || k <= 0) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        for (int i = 1; i <= k - 1; i++) {
            fast = fast.next;
            if (fast == null) {
                return null;
            }
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //链表分割
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.data <= x) {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                if (as == null) {
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if (bs == null) {
            return as;
        }
        be.next = as;
        if (as != null) {
            ae.next = null;
        }
        return bs;
    }
}
    //链表合并
    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode newHead=new ListNode(0);
//        ListNode cur=newHead;
//        while(l1!=null&&l2!=null){
//            if(l1.val>l2.val){
//                cur.next=l2;
//                l2=l2.next;
//            }
//            else{
//                cur.next=l1;
//                l1=l1.next;
//            }
//            cur=cur.next;
//        }
//        if(l1!=null&&l2==null){
//            cur.next=l1;
//        }
//        if(l1==null&&l2!=null){
//            cur.next=l2;
//        }
//        return newHead.next;
//    }

//删除链表的重复结点
//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
//    public ListNode deleteDuplication(ListNode pHead){
//        if(pHead == null)
//            return null;
//        ListNode newHead = new ListNode(-1);
//        ListNode tmp = newHead;
//        ListNode cur = pHead;
//        while(cur != null) {
//            if(cur.next!=null&&cur.val == cur.next.val) {
//                //此循环是过滤重复结点，若删除此循环，则会将重复结点保留一个
//                while(cur.next!=null&&cur.val == cur.next.val){
//                    cur=cur.next;
//                }
//                cur=cur.next;
//            }else{
//                tmp.next=cur;
//                tmp=tmp.next;
//                cur=cur.next;
//            }
//        }
//        tmp.next=null;
//        return newHead.next;
//    }

