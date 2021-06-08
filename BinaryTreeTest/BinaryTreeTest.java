class TreeNode {
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val){
        this.val = val;
    }
}

class BinaryTree {
    public TreeNode creatTreat(){
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }

    // 前序遍历
    public void preOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    public void inOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    public void posOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        posOrderTraversal(root.left);
        posOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // 遍历思路 - 求节点个数  前序遍历
    static int size = 0;
    public void getSize(TreeNode root){
        if(root == null){
            return;
        }
        size ++;
        getSize(root.left);
        getSize(root.right);
    }


    public int getSize1(TreeNode root){
        if(root == null){
            return 0;
        }
        return getSize1(root.left) + getSize1(root.right) + 1;
    }
}


public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        TreeNode root = b.creatTreat();

        b.preOrderTraversal(root);
        System.out.println();

        b.inOrderTraversal(root);
        System.out.println();

        b.posOrderTraversal(root);
        System.out.println();

        b.getSize(root);
        System.out.println(BinaryTree.size);

        int ret = b.getSize1(root);
        System.out.println(ret);

    }

}