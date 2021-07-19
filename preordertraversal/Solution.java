package preordertraversal;

/*
 * @author wangyimu
 * @create 2021-07-19-22:31
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return ret;
        }

        ret.add(root.val);
        System.out.println(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return ret;
    }
}


