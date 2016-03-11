import java.util.Stack;

/**
 * Created by toryang on 16/3/10.
 */

/**
 * 题目描述:
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class GetMinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    Integer temp = null;
    public void push(int node) {
        if (temp != null){
            if (node <= temp){
                temp = node;
                min.push(node);
            }
            stack.push(node);
        }else {
            temp = node;
            min.push(node);
            stack.push(node);
        }

    }

    public void pop() {
        int num = stack.pop();
        int num1 = min.pop();
        if (num != num1){
            min.push(num1);
        }
    }

    public int top() {
        int num = min.pop();
        stack.push(num);
        return num;
    }

    public int min() {
        int num = min.pop();
        min.push(num);
        return num;
    }
}
