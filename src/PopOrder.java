import java.util.Stack;

/**
 * Created by toryang on 16/3/10.
 */

/**
 * 题目描述:
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如
 * 序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 */
public class PopOrder {
    public static boolean isPopOrder(int[] pushA,int[] popA){
       if (pushA.length == 0 || popA.length == 0) return false;
       if (pushA.length != popA.length) return false;
        Stack<Integer> stack = new Stack<>();
        for (int i=0,j=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (j < popA.length && stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        System.out.println(isPopOrder(pushA,popA));
    }
}
