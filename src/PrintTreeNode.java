
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by toryang on 16/3/11.
 */

/**
 * 题目描述
 * 层序遍历二叉树;
 */
public class PrintTreeNode {
    public ArrayList<Integer> printValFromTop2Bott(TreeNode tree){
        if (tree == null){
            return new ArrayList<Integer>();
        }

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        queue.offer(tree);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            list.add(treeNode.val);

            if (tree.leftTree!= null){
                queue.offer(treeNode.leftTree);
            }

            if (treeNode.rightTree != null){
                queue.offer(treeNode.rightTree);
            }
        }

        return list;

    }

}
