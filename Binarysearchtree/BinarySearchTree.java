package Binarysearchtree;

/**
 * @author wangyimu
 * @create 2021-07-31-12:03
 */
public class BinarySearchTree {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node root;
    /*
     * 查找
     */
    public Node search(int key) {
        Node cur = root;
        while (cur != null) {
            if (cur.val == key) {
                return cur;
            } else if (cur.val < key) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        return null;
    }


    /*
     * 插入:每次插入 一定是插入到叶子节点的地方
     */
    public boolean insert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;

        while (cur != null) {
            if (cur.val == key) {
                return false;
            } else if (cur.val < key) {
                parent = cur;
                cur = cur.right;
            } else {
                parent = cur;
                cur = cur.left;
            }
        }
        if (parent.val > key) {
            parent.left = node;
        } else {
            parent.right = node;
        }

        return true;
    }

    /*
     * 删除
     */

    public void remove(Node cur, Node parent) {
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else if (cur == parent.left) {
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }
        } else {
            Node targetparent = cur;
            Node target = cur.right;
            while (target.left != null) {
                targetparent = target;
                target = target.left;
            }

            cur.val = target.val;
            if (target == targetparent.left) {
                targetparent.left = target.right;
            } else {
                targetparent.right = target.right;
            }
        }
    }

    public void removeKey(int key) {
        Node node = new Node(key);
        if (root == null) {
            return;
        }
        Node cur = root;
        Node parent = null;

        while (cur != null) {
            if (cur.val == key) {
                remove(cur, parent);
                return;
            } else if (cur.val < key) {
                parent = cur;
                cur = cur.right;
            } else {
                parent = cur;
                cur = cur.left;
            }
        }
    }



}