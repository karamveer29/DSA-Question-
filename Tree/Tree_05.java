// Maximum depth of binary Tree
import java.util.*;
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
public class Tree_05 {
    int maxDepth(Node root){
        if(root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        int level =0;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++){
                Node front = q.poll();
                if(front.left != null){
                    q.add(front.left);
                }
                if(front.right != null){
                    q.add(front.right);
                }
            }
            level++;
        }
        return level;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        Tree_05 sol = new Tree_05();
        int depth = sol.maxDepth(root);
        System.out.println("Maximum depth of the binary Tree: "+depth);

    }
}
