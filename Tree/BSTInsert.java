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
public class BSTInsert {
    Node insert(Node root, int val){

        if(root == null)
            return new Node(val);
        
        if(val < root.data) root.left = insert(root.left, val);
        else if(val > root.data) root.right = insert(root.right, val);

        return root;
    }
    void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BSTInsert bst = new BSTInsert();
        Node root = null;
        int[] val = {5, 3, 7, 2, 4, 6, 8};
        for(int v : val){
            root = bst.insert(root, v);
        }
        System.out.print("Inorder Traversal: ");
        bst.inorder(root);
    }
}
