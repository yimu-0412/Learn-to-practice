package treeTraversal;

/**
 * @author wangyimu
 * @create 2021-07-24-22:08
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binary = new BinaryTree();
        TreeNode t = binary.creatTree();
        System.out.print("前序遍历：");
        binary.preorderTraversal(t);
        System.out.println();
        System.out.println("*********************************");

        System.out.print("中序遍历：");
        binary.inOrderTraversal1(t);
        System.out.println();
        System.out.println("*********************************");

        System.out.print("后序遍历：");
        binary.postOrderTraversal1(t);
        System.out.println();
        System.out.println("*********************************");


        System.out.print("层序遍历：");
        binary.levelOrder(t);
    }

}


