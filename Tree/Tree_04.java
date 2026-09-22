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
public class Tree_04 {
    public static List<Integer> postorder(Node root){
        List<Integer> postorder = new ArrayList<>();
        if(root == null){
            return postorder;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while(!st1.empty()){
            root = st1.pop();
            st2.push(root);
            if(root.left != null){
                st1.push(root.left);
            }
            if(root.right != null){
                st1.push(root.right);
            }
        }
        while(!st2.empty()){
            postorder.add(st2.pop().data);
        }
        return postorder;
    }
    public static void printList(List<Integer> list){
        for(int num : list){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
             Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting postorder traversal
        List<Integer> result = postorder(root);

        // Printing the postorder traversal result
        System.out.print("Postorder traversal: ");
        printList(result);
    }
}
