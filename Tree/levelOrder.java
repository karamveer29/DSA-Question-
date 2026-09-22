import java.util.LinkedList;
import java.util.Queue;

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

public class levelOrder {

    // Level Order Traversal (BFS)
    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // marker for end of level

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                System.out.println(); // new line for next level

                if (q.isEmpty()) {
                    break; // all levels done
                } else {
                    q.add(null); // marker for next level
                }
            } else {
                System.out.print(curr.data + " "); // 👈 use print instead of println
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {

        //  Build a sample tree
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

        System.out.println("Level Order Traversal:");
        levelorder(root);
    }
}
