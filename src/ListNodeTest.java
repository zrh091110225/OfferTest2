import java.util.Stack;

/**
 * Created by toryang on 16/3/10.
 */
public class ListNodeTest {
    /**
     * 使用栈;
     *
     *
     */
    public static ListNode findKthNode(ListNode head,int k){
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head!=null){
            stack.push(head.next);
        }
        int i = 0;
        while (i<k-1){
            stack.pop();
        }

        return stack.pop();
    }


    public static ListNode findKthNode2(ListNode head,int k){
        if (head == null || k<=0){
            return null;
        }
        ListNode pre = head;
        ListNode last = head;
        for (int i=1;i<k;i++){
            if (pre.next != null){
                pre = pre.next;
            }else {
                return null;
            }
        }

        while (pre.next != null){
            pre = pre.next;
            last = last.next;
        }

        return last;
    }
}
