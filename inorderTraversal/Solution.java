package inorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyimu
 * @create 2021-07-19-22:55
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }


        List<Integer> leftTree = inorderTraversal(root.left);
        ret.addAll(leftTree);

        ret.add(root.val);

        List<Integer> rightTree = inorderTraversal(root.right);
        ret.addAll(rightTree);

        return ret;
    }
}
