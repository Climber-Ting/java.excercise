import java.util.*;

class ListNode {
    public int val;
    public ListNode next;
    public ListNode prev;
    //alt+insert   ->   Constructor
    public ListNode(int val) {
        this.val = val;
    }
}

public class DoubleLinkedList {

    public ListNode head;//头
    public ListNode last;//尾


    //头插法
    public void addFirst(int data) {
        ListNode node =new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }
        else{
            node.next=this.head;
            this.head.prev=node;
            this.head=node;
        }

    }
    //尾插法
    public void addLast(int data) {
        ListNode node =new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }
        else{
            node.prev=this.last;
            this.last.next=node;
            this.last=node;
        }
    }
    //
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==this.size()){
            addLast(data);
            return;
        }
        ListNode node=new ListNode(data);
        ListNode cur=this.head;
        while(index!=0){
            cur=cur.next;
            index--;
        }
        node.next=cur;
        node.prev=cur.prev;
        cur.prev.next=node;
        cur.prev=node;
    }
    //得到单链表的长度
    public int size() {
        int count=0;
        ListNode cur=this.head;
        if(this.head==null){
            return -1;
        }
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if(cur == this.last) {
                    cur.prev.next = null;
                    this.last = this.last.prev;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return;
            }
            cur = cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    //头结点
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        //cur.next == null
                        this.last = this.last.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    public void clear() {
        this.head = null;
        this.last = null;
    }
}

