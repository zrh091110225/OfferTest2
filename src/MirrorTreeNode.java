/**
 * Created by toryang on 16/3/10.
 */

/**
 * 二叉树的镜像定义：源二叉树
 *       8
       /  \
      6   10
     / \  / \
    5  7 9 11
     镜像二叉树
        8
      /  \
     10   6
    / \  / \
   11 9 7  5
 */
public class MirrorTreeNode {

    public void Mirror(TreeNode node){

        if (node != null){
            Mirror(node.leftTree);
            Mirror(node.rightTree);
            TreeNode temp = node.leftTree;
            node.leftTree = node.rightTree;
            node.rightTree = node.leftTree;
        }
    }
}
