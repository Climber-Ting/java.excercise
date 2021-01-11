import java.util.*;
/*
给定一个链表，判断链表中是否有环。
如果链表中存在环，则返回 true 。 否则，返回 false 。
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        //定义快慢指针，速度为2倍，如果有环，迟早会相遇
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
