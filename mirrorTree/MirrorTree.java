package mirrorTree;

/**
 * @author wangyimu
 * @create 2021-07-20-22:35
 *  二叉树的镜像
 *      请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */
public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return root;
        }

        if(root.left == null && root.right == null){
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left != null){
            mirrorTree(root.left);
        }

        if(root.right != null){
            mirrorTree(root.right);
        }

        return root;
    }
}
