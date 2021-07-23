package convert;

/**
 * @author wangyimu
 * @create 2021-07-22-7:07
 *  二叉搜索树与双向链表:
 */
public class Convert {
    TreeNode prev = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        ConvertChild(pRootOfTree);
        TreeNode head = pRootOfTree;

        while(head.left != null){
            head = head.left;
        }
        return head;
    }


    public void  ConvertChild(TreeNode pCur){


        if(pCur == null){
            return;
        }

        ConvertChild(pCur.left);
        pCur.left = prev;
        if(prev != null){
            prev.right = pCur;
        }
        prev = pCur;
        ConvertChild(pCur.right);

    }

}

