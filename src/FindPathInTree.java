/**
 * Created by toryang on 16/3/16.
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述:
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class FindPathInTree {
    /**
     * 解题思路:
     * 从头结点开始,分别向左向右遍历,看是否存在某条路径,所有的结点值相加等于该target
     * 以该树为例:看题目中打印出的pop值,则可本题中的理解递归;
     *    5
     *   / \
     *   3 7
     *  /\ /\
     * 2 4 6 8
     *
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> pathList=
                new ArrayList<ArrayList<Integer>>();
        if(root==null)
            return pathList;
        Stack<Integer> stack=new Stack<Integer>();
        FindPath(root,target,stack,pathList );
        return pathList;

    }
    private void FindPath(TreeNode root, int target,
                          Stack<Integer> path,
                          ArrayList<ArrayList<Integer>> pathList) {
        if(root==null)
            return;
        if(root.leftTree==null&&root.rightTree==null){
            if(root.val==target){
                ArrayList<Integer> list=
                        new ArrayList<Integer>();
                for(int i:path){
                    list.add(i);
                }
                list.add(root.val);
                pathList.add(list);
            }
        }
        else{
            path.push(root.val);
            System.out.println("push:"+root.val);
            FindPath(root.leftTree, target-root.val, path, pathList);
            FindPath(root.rightTree, target-root.val, path,  pathList);
            System.out.println("pop:"+path.pop());

        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.leftTree = new TreeNode(3);
        node.leftTree.leftTree = new TreeNode(2);
        node.leftTree.rightTree = new TreeNode(4);
        node.rightTree = new TreeNode(7);
        node.rightTree.leftTree = new TreeNode(6);
        node.rightTree.rightTree = new TreeNode(8);
        new FindPathInTree().FindPath(node,10);

    }



}
