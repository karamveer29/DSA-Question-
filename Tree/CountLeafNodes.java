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
public class CountLeafNodes {
    int countleaf(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return countleaf(root.left) + countleaf(root.right);

    }
    public static void main(String[] args) {
        CountLeafNodes tree = new CountLeafNodes();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Leaf Nodes :"+ tree.countleaf(root));
        
    }
}
