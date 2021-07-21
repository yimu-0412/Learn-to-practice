package binaryprint;

import sun.reflect.generics.tree.Tree;

import java.util.Scanner;

/**
 * @author wangyimu
 * @create 2021-07-21-22:11
 *      编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树
 *  （以指针方式存储）。例如如下的先序遍历字符串： ABC##DE#G##F###
 *   其中“#”表示的是空格，空格字符代表空树。建立起此二叉树以后，
 *   再对二叉树进行中序遍历，输出遍历结果。
 */
public class BrinayrPrint {
    public static int i = 0;
    public TreeNode creatTree(String str){
        if(str == null) return null;
        TreeNode root = null;
        if(str.charAt(i) != '#'){
            root = new TreeNode(str.charAt(i));
            i ++;
            root.left = creatTree(str);
            root.right = creatTree(str);
        }else{
            i ++;
        }
        return root;
    }

    public void inOrderTraversal(TreeNode  root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        BrinayrPrint b = new BrinayrPrint();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        TreeNode root = b.creatTree(str);
        b.inOrderTraversal(root);
    }
}
