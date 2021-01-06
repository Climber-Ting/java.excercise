import java.util.*;
public class ListNode {
    ListNode head;
    int val;
    ListNode next;
    public ListNode(){

    }
    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
    public ListNode(int val){
        this.val=val;
    }
    public void add(int val){
        ListNode node=new ListNode(val);
        if(this==null) {
            this.head= node;
        }
        else{
            node.next=this.head;
            this.head=node;
        }
    }
    public void display(){
        ListNode cur=this.head;
        while()
    }
    //判断一个单链表是不是回文结构
    public boolean chkPalindrome(ListNode A) {
        if(A==null){
            return false;
        }
        //1.找到当前链表的中间位置
        ListNode fast=A;
        ListNode slow=A;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        //2.从中间位置开始反转链表
        ListNode cur=slow.next;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        //3.head从前往后走，slow从后往前走
        while(A!=slow&&A.next!=slow){
            if(A.val==slow.val){
                A=A.next;
                slow=slow.next;
            }
            else{
                return false;
            }
        }
        return true;
        //只要发现对应的val值不一样，就返回false，否则就是回文结构
    }
}
