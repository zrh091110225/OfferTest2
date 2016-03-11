/**
 * Created by toryang on 16/3/10.
 */

/**
 * 题目描述:
 * 输入两颗二叉树A，B，判断B是不是A的子结构。
 */
public class HasSubTreeTest {
    /**
     * 解题思路:
     * 1,在树A中找到和B的根节点的值一样的结点R；
     * 2,第二步再判断树A中以R为根结点的子树是不是包含和树B一样的结构。
     */

    public boolean hasSubTree(TreeNode root1,TreeNode root2){
        if (root1 == null || root2 == null){
            return false;
        }
        boolean flag = false;
        if (root1.val == root2.val){
            flag = isSubTree(root1,root2);
        }
        if (!flag){
            flag = hasSubTree(root1.leftTree,root2);
            if (!flag){
                flag = hasSubTree(root1.rightTree,root2);
            }
        }

        return flag;
    }

    public boolean isSubTree(TreeNode root1,TreeNode root2){
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val == root2.val){
            return isSubTree(root1.leftTree,root2.leftTree) && isSubTree(root1.rightTree,root2.rightTree);
        }
        return false;
    }

}
