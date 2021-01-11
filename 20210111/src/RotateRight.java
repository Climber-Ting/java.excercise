import java.util.*;
/*
    旋转链表
    给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。

    示例 1:
    输入: 1->2->3->4->5->NULL, k = 2
    输出: 4->5->1->2->3->NULL
    解释:
    向右旋转 1 步: 5->1->2->3->4->NULL
    向右旋转 2 步: 4->5->1->2->3->NULL

    示例 2:
    输入: 0->1->2->NULL, k = 4
    输出: 2->0->1->NULL
    解释:
    向右旋转 1 步: 2->0->1->NULL
    向右旋转 2 步: 1->2->0->NULL
    向右旋转 3 步: 0->1->2->NULL
    向右旋转 4 步: 2->0->1->NULL
 */
class ListNode{
    int data;
    ListNode next;

    public ListNode() {

    }
    public ListNode(int data) {
        this.data=data;
    }
}
/*
    定义快慢指针，用倒数第几个结点的思路，但是不是相隔k-1，而是k，确保能找到head
 */
public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k<0){
            return null;
        }
        if(k==0||head.next==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(k!=0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }
            else{
                fast=head;
                k--;
            }
        }
        //如果循环完成后slow==fast，证明刚好是链表的个数，即效果等同于不旋转。
        if(slow==fast){
            return head;
        }
        //循环找到新的头结点
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode tmp=slow.next;
        slow.next=null;
        fast.next=head;
        return tmp;
    }
}
