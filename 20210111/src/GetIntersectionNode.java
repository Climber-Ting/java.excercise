import java.util.*;
/*
编写一个程序，找到两个单链表相交的起始节点。

 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode pl=headA;  //假设pl始终指向较长的链表
        ListNode ps=headB;
        int lenA=0;
        int lenB=0;
        while(pl!=null){
            pl=pl.next;
            lenA++;
        }
        while(ps!=null){
            ps=ps.next;
            lenB++;
        }
        pl=headA;          //一定要将pl、ps重新指回来
        ps=headB;
        int len=lenA-lenB;  //len表示长短链表的差值
        if(len<0){       //如果len<0，假设失败，将pl重新指向较长的链表
            pl=headB;
            ps=headA;
            len=lenB-lenA;
        }
        //此时pl指向较长链表，将pl先走len步
        while(len!=0){
            pl=pl.next;
            len--;
        }
        while(pl!=ps){
            pl=pl.next;
            ps=ps.next;
        }
        return pl;
    }
}
