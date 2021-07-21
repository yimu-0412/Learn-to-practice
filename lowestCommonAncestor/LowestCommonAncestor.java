package lowestCommonAncestor;

/**
 * @author wangyimu
 * @create 2021-07-21-23:19
 *    二叉树的最近公共祖先
 *      百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，
 *      最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度
 *      尽可能大（一个节点也可以是它自己的祖先）。”
 */
public class LowestCommonAncestor {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
        if(root == p || root == q){
            return root;
        }

        TreeNode lefttree = lowestCommonAncestor(root.left,p,q);
        TreeNode righttree = lowestCommonAncestor(root.right,p,q);

        if(lefttree != null && righttree != null){
            return root;
        }

        // 左树不为空，右树为空
        if(lefttree != null){
            return lefttree;
        }

        // 右树不为空，左树为空
        if(righttree != null){
            return righttree;
        }

        return null;

    }

}
