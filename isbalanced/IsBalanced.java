package isbalanced;

/**
 * @author wangyimu
 * @create 2021-07-20-21:01
 *  平衡二叉树
 *
 *   给定一个二叉树，判断它是否是高度平衡的二叉树。
 *  本题中，一棵高度平衡二叉树定义为：
 *      一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 *
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) >= 0;
    }


    /*
    *  原理：就是在求高度的同时，只要一个子树不满足就直接结束
    *       自下而上的方式
    * */
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftHight = maxDepth(root.left);
        int rightHight = maxDepth(root.right);


        /*
        *  只要当前根的左树或者右树不满足，即
        *       leftHight == -1或者 rightHight == -1
        *   就不进入if语句
        */
        if(leftHight >= 0 && rightHight >= 0
                && Math.abs(leftHight - rightHight ) <= 1){
            return Math.max(leftHight ,rightHight ) + 1;
        }else{
            return -1;
        }
    }
}
