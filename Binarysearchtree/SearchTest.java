package Binarysearchtree;;
/**
 * @author wangyimu
 * @create 2021-07-31-16:15
 */
public class SearchTest {
    public static void inOrder(BinarySearchTree.Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void preOrder(BinarySearchTree.Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        BinarySearchTree test = new BinarySearchTree();
        test.insert(13);
        test.insert(1);
        test.insert(21);
        test.insert(14);
        test.insert(5);
        test.insert(6);
        inOrder(test.root);
        System.out.println();
        preOrder(test.root);

        System.out.println();
        System.out.println(test.search(1).val);
        test.removeKey(13);
        inOrder(test.root);
        System.out.println();
        preOrder(test.root);
    }
}
