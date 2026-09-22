// subtree of another tree
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

public class SubTree {

    // Check if two trees are identical
    public boolean isIdentical(Node root, Node subroot) {
        if (subroot == null && root == null) {
            return true;
        }
        if (root == null || subroot == null) {
            return false;
        }
        if (root.data == subroot.data) {
            return isIdentical(root.left, subroot.left) &&
                   isIdentical(root.right, subroot.right);
        }
        return false;
    }

    // Check if subroot is a subtree of root
    public boolean isSubTree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subroot)) {
            return true;
        }
        return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
    }

    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        /*
               2
              / \
             4   5
        */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        // ✅ Create object of SubTree class
        SubTree tree = new SubTree();

        // ✅ Call the method properly
        System.out.println("SubTree of another Tree: " + tree.isSubTree(root, subroot));
    }
}
