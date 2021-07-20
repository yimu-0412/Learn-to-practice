package levelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wangyimu
 * @create 2021-07-21-0:06
 *  二叉树的层序遍历
 *      给你一个二叉树，请你返回其按 层序遍历 得到的节点值。
 *      （即逐层地，从左到右访问所有节点）。
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 为了满足题目需求
        List<List<Integer>> ret = new ArrayList<>();

        if(root == null){
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while(size != 0){
                TreeNode top = queue.poll();
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
