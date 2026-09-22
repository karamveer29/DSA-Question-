import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BSTZigZag {
    public List<List<Integer>> ZigZagLevelOrder(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean leftToright = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++){
                Node node = q.poll();
                
                if(leftToright){
                    level.add(node.data);
                }else{
                    level.add(0,node.data);
                }
                // Add children 
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            result.add(level);
            leftToright = !leftToright;
        }
        return result;
    }
    static void printResult(List<List<Integer>> result){
        for(List<Integer> row : result){
            for(int val : row){
                System.out.print(val+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BSTZigZag solution = new BSTZigZag();

        // Get the zigzag level order traversal
        List<List<Integer>> result = solution.ZigZagLevelOrder(root);

        // Print the result
        printResult(result);
    }
}
