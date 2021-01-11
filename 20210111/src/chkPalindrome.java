import java.util.*;
/*
对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
 */
public class chkPalindrome {
    public boolean chkPalindrome(ListNode A) {
        if(A==null||A.next==null){
            return false;
        }
        ListNode fast=A;
        ListNode slow=A;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode B=slow;
        ListNode cur=slow.next;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=B;
            B=cur;
            cur=curNext;
        }
        while(A!=B&&A.next!=B){
            if(A.data==B.data){
                A=A.next;
                B=B.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
