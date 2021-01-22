
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public static ListNode Merge(ListNode list1,ListNode list2) {

        ListNode cur1=list1;
        ListNode cur2=list2;

        ListNode head=new ListNode(0);
        ListNode cur=head;
        while(cur1.next!=null||cur2.next!=null){
            if(cur1.val<cur2.val){
               cur.next=cur1;
               cur=cur.next;
               cur1=cur1.next;

            }
            else if(cur1.val>cur2.val){
                cur.next=cur2;
                cur=cur.next;
                cur2=cur2.next;

            }
            else if(cur1.val==cur2.val){
                cur.next=cur2;
                cur=cur.next;
                cur.next=cur1;
                cur=cur.next;
                cur2=cur2.next;
                cur1=cur1.next;
            }
            if(cur1==null){
                cur.next=cur2;
                cur2.next=null;
            }
            if(cur2==null){
                cur.next=cur1;
                cur1.next=null;
            }
        }
        return head.next;
    }
}