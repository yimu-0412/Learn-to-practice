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
        二叉树的层序遍历
    */
    public List<List<Character>> levelOrder(TreeNode root){

        List<List<Character>> ret = new LinkedList<>();
        if(root == null){
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(! queue.isEmpty()){
            int size = queue.size();
            List<Character> list = new ArrayList<>();
            while(size != 0){
                TreeNode top = queue.poll();
                //System.out.print(top.val + " ");
                list.add(top.val);
                if(top.left != null){
                    queue.offer(top.left);
                }
                if(top.right != null){
                    queue.offer(top.right);
                }
                size --;
            }
            ret.add(list);
        }
        return ret;
    }
}
