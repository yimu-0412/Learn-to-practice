package preordertraversal;

import java.util.ArrayList;
import java.util.List;

/*
 * @author wangyimu
 * @create 2021-07-19-22:41
 */


public class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }

        ret.add(root.val);
        System.out.println(root.val);
        List<Integer> leftTree = preorderTraversal(root.left);
        ret.addAll(leftTree);
        List<Integer> rightTree = preorderTraversal(root.right);
        ret.addAll(rightTree);
        return ret;
    }
}
