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
public class BSTDelete {
    Node delete(Node root, int key){
        if(root == null) return null;
        if(key < root.data)
        root.left = delete(root.left, key);
        else if(key > root.data)
        root.right = delete(root.right, key);
        else{
            // case-1 one child
            if(root.left == null) return root.right;

            //  case-2 no child
            else if(root.right == null) return root.left;

            // case-3 Two children & find inorder successor
            root.data = findMin(root.right);
            root.right = delete(root.right, root.data); 
        }
        return root;
    }
    int findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
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
        int[] val = {5,3,7,2,4,6,8};

        for(int v : val){
            root = bst.insert(root, v);
        }
        BSTDelete obj = new BSTDelete();
        System.out.print("Print Original BST: ");
        obj.inorder(root);

        root = obj.delete(root, 6);
        System.out.print("After Deleting: ");
        obj.inorder(root);
    }
}
