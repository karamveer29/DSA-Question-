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

// Helper class to store height and diameter together
class TreeInfo {
    int height;
    int diam;

    TreeInfo(int height, int diam) {
        this.height = height;
        this.diam = diam;
    }
}

public class TreeDiameter {

    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        // Recursive calls for left and right subtrees
        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);

        // Current node height
        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;

        // Possible diameters:
        int diam1 = leftTI.height + rightTI.height + 1; // passes through root
        int diam2 = leftTI.diam; // entirely in left subtree
        int diam3 = rightTI.diam; // entirely in right subtree

        // Maximum diameter among the three
        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
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

        TreeInfo info = diameter(root);
        System.out.println("Diameter of the Tree: " + info.diam);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 // Helper class to store height and diameter together
class TreeInfo {
    int height;
    int diam;

    TreeInfo(int height, int diam) {
        this.height = height;
        this.diam = diam;
    }
}


                                
// Node class for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Solution {
    // Function to find the
    // diameter of a binary tree
    public int diameterOfBinaryTree(Node root) {
        // Initialize the variable to
        // store the diameter of the tree
        int[] diameter = new int[1];
        diameter[0] = 0;
        // Call the height function to traverse
        // the tree and calculate diameter
        height(root, diameter);
        // Return the calculated diameter
        return diameter[0];
    }

    // Function to calculate the height of
    // the tree and update the diameter
    private int height(Node node, int[] diameter) {
        // Base case: If the node is null,
        // return 0 indicating the
        // height of an empty tree
        if (node == null) {
            return 0;
        }

        // Recursively calculate the
        // height of left and right subtrees
        int[] lh = new int[1];
        int[] rh = new int[1];
        lh[0] = height(node.left, diameter);
        rh[0] = height(node.right, diameter);

        // Update the diameter with the maximum
        // of current diameter or sum of
        // left and right heights
        diameter[0] = Math.max(diameter[0], lh[0] + rh[0]);

        // Return the height of
        // the current node's subtree
        return 1 + Math.max(lh[0], rh[0]);
    }
}

// Main class
public class Main {
    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        // Creating an instance of the Solution class
        Solution solution = new Solution();

        // Calculate the diameter of the binary tree
        int diameter = solution.diameterOfBinaryTree(root);

        System.out.println("The diameter of the binary tree is: " + diameter);
    }
}                                  
