/**
 * Created by toryang on 16/3/10.
 */

/**
 * 题目描述:链表反转
 */
public class ListNodeReverse {

    /**
     *
     * 解题思路:
     *
     */
    public ListNode reverseNode(ListNode head){
        ListNode pre=null;
        ListNode last=null;
        while(head!=null)
        {
            last=head.next;
            head.next=pre;
            pre=head;
            head=last;
        }
        return pre;
    }
}
