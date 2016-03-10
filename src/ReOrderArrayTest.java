/**
 * Created by toryang on 16/3/10.
 */

/**
 * 题目描述:
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 */
public class ReOrderArrayTest {
    /**
     * 解题思路:
     * 从最后面开始,两个两个比较,如果遇到相邻两个数左边的是偶数,右边的是奇数,则互换位置;否则换下一个
     * @param array
     */
    public static int[] reOrderArray(int[] array){

        for (int i=0;i<array.length;i++){
            for (int j=array.length-1; j>i; j--){
                if (!isOdd(array[j-1]) && isOdd(array[j])){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static boolean isOdd(int num){
        if (num%2 == 0){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        for (int i : reOrderArray(array)){
            System.out.println(i);
        }
    }
}
