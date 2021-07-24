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
        二叉树后序非递归遍历实现
    */
    public void postOrderTraversal1(TreeNode root){
        if(root == null){
            return;
        }

        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null; // 记录上次打印的数据

        while(cur != null || !stack.empty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.peek();
            if(cur.right == null || pre == cur.right){
                TreeNode popNode = stack.pop();
                System.out.print(popNode.val + " ");
                pre = cur;
                cur = null;
            }else{
                cur = cur.right;
            }
        }
    }
}
