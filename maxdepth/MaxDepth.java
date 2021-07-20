package maxdepth;

/**
 * @author wangyimu
 * @create 2021-07-20-20:59
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftHight = maxDepth(root.left);
        int rightHight = maxDepth(root.right);

        return leftHight > rightHight? leftHight + 1 : rightHight + 1;
    }
}
