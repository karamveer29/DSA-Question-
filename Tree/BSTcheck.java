class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BSTcheck {
    boolean isBSTUtil(Node root, long min, long max ){
        if(root == null) return true;
        if(root.data <= min || root.data > max) return false;
        return isBSTUtil(root.left, min, root.data) &&
        isBSTUtil(root.right, root.data, max);
    }
    boolean isBST(Node root){
        return isBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        BSTcheck check = new BSTcheck();
        System.out.println("IS BST ?" + check.isBST(root));

        root.right.left.data = 10;
        System.out.println("Is BST after change?" + check.isBST(root));
    }
}

