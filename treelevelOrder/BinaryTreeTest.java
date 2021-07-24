package treeTraversal;

/**
 * @author wangyimu
 * @create 2021-07-24-22:08
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binary = new BinaryTree();
        TreeNode t = binary.creatTree();
        
        System.out.print("层序遍历：");
        List<List<Character>> ret =  binary.levelOrder(t);
        System.out.println(ret);
    }

}


