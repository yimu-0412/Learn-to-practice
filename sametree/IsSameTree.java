package sametree;

/**
 * @author wangyimu
 * @create 2021-07-20-19:54
 *
 *  检查两颗树是否相同：
        给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
        如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( (p ==  null && q != null) || (p != null && q == null )){
            return false;
        }
        if(p == null && q == null){
            return true;
        }

        // 都不为空
        if(p.val != q.val){
            return false;
        }

        // p和q都不为空，且对应值是相同的，那么去判断p和q的左树和右树
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}
