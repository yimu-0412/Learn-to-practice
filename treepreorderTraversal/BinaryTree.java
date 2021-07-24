package treeTraversal;


import java.util.*;

/**
 * @author wangyimu
 * @create 2021-07-24-21:44
 */
public class BinaryTree {

    public TreeNode creatTree(){
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }

    /*
        二叉树前序非递归遍历实现
    */
    public void  preorderTraversal(TreeNode root) {
        if(root == null){
            return;
        }

        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();

        while(cur != null || !stack.empty() ){
            while(cur != null){
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;
            }

            TreeNode top = stack.pop();
            cur = top.right;
        }
    }

  
}
