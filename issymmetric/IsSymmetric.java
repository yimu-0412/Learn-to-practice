package issymmetric;

/**
 * @author wangyimu
 * @create 2021-07-20-21:31
 *  对称二叉树
 *     给定一个二叉树，检查它是否是镜像对称的
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymmetricchild(root.left,root.right);
    }

    public boolean isSymmetricchild(TreeNode lefttree,TreeNode righttree){
        if(lefttree == null && righttree != null){
            return false;
        }

        if(lefttree != null && righttree == null){
            return false;
        }

        if(lefttree == null && righttree == null){
            return true;
        }

        if(lefttree.val != righttree.val){
            return false;
        }
        return isSymmetricchild(lefttree.left,righttree.right) &&
                isSymmetricchild(lefttree.right,righttree.left) ;

    }
}
