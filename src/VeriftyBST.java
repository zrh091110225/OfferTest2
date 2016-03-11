import java.util.Arrays;

/**
 * Created by toryang on 16/3/11.
 */

/**
 * 题目描述:
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VeriftyBST {
    /**
     * 解题思路:
     * 1,二叉搜索数,左子树的值都小于右子树的值
     * 2,后序遍历,数组最后一个数字为跟节点;
     * 3,得到跟节点后,可以将数组前n-1个数分为左右两部分,左部分的数值均小于右部分的值;
     * 4,递归,3中得到的左右两部分数值均可以按照2,3步骤重复执行;
     * 5,若递归后全部判断正确,则返回true;
     *
     * @param sequence
     * @return
     */
    public static boolean vertifySquenceOfBST(int[] sequence){
        if (sequence.length == 0){
            return false;
        }
        int length = sequence.length;
        int mid = sequence[length-1];
        int i = 0;
        for (;i<length;i++){
            if (mid < sequence[i]){
                break;
            }
        }
        int j=i;
        for (;j<length;j++){
            if (mid > sequence[j]){
                return false;
            }
        }
        boolean left = true;
        boolean right = true;

        if (i>0 && i<length-1){
            left = vertifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
            right = vertifySquenceOfBST(Arrays.copyOfRange(sequence,i,length-1));
        }

        return (left&&right);
    }

    public static void main(String[] args) {
        int[] array = {4,8,6,12,16,14,10};
        System.out.println(vertifySquenceOfBST(array));
    }
}
