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
public class BSTMinMax {
    int findMin(Node root){
        if(root == null) throw new IllegalAccessError("Tree is empty");
        while (root.left != null) {
            root = root.left;
        }
        return root.data;

    }
    int findMax(Node root){
        if(root == null) throw new IllegalAccessError("Tree is Empty! ");
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }
    public static void main(String[] args) {
        BSTInsert bst = new BSTInsert();
        Node root = null;
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        for (int v : values)
            root = bst.insert(root, v);

        BSTMinMax obj = new BSTMinMax();
        System.out.println("Minimum : "+obj.findMin(root));    
        System.out.println("Maximum  : "+obj.findMax(root));    
    }
}
