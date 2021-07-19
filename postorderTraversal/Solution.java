package postorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyimu
 * @create 2021-07-19-22:57
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }


        List<Integer> leftTree = postorderTraversal(root.left);
        ret.addAll(leftTree);

        List<Integer> rightTree = postorderTraversal(root.right);
        ret.addAll(rightTree);

        ret.add(root.val);

        return ret;
    }
}
