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

public class TreeTraversal_01 {

    // Preorder Traversal (Root → Left → Right)
    public static void preorder(Node root) {
        if (root == null) {
            return;  // stop recursion instead of printing -1
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal (Left → Root → Right)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder Traversal (Left → Right → Root)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Count number of nodes
    public static int countOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countOfNode(root.left);
        int rightCount = countOfNode(root.right);
        return leftCount + rightCount + 1;
    }

    // Sum of all node values
    public static int sumOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        return leftSum + rightSum + root.data;
    }

    // Height of the tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
  

    public static void main(String[] args) {

        // 🏗️ Build a simple tree
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
        // root.right.right = new Node(6);

        // 🧩 Print Traversals
        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();

        // 🧮 Print other results
        System.out.println("Count of Nodes: " + countOfNode(root));
        System.out.println("Sum of Nodes: " + sumOfNode(root));
        System.out.println("Height of Tree: " + height(root));
    }
}
