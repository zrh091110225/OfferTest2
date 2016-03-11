/**
 * Created by toryang on 16/3/10.
 */

/**
 * 题目描述:
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeNode {
    /**
     * 解题思路:
     * 1,定义一个新的链表listnode;
     * 2,判断list1和list2的val值,那个小就让listnode的next指向哪个节点;
     * 3,使用递归,将list1和list2的值全部遍历;
     *
     * @param list1
     * @param list2
     * @return
     */

    public ListNode Merge(ListNode list1,ListNode list2){
        if (list1 ==null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }

        ListNode listNode = null;
        if (list1.val > list2.val){
            listNode = list2;
            listNode.next = Merge(list1,list2.next);
        }else {
            listNode = list1;
            listNode.next = Merge(list1.next,list2);
        }
        return listNode;
    }
}
