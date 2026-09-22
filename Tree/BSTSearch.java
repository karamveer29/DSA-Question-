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
public class BSTSearch {
    boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key) return true;
        if(key < root.data) return search(root.left, key);
        else 
           return search(root.right, key);
    }
    public static void main(String[] args) {
        BSTInsert bst = new BSTInsert();
        Node root = null;
        int[] val = {5, 3, 7, 2, 4, 6, 8};
        for(int v : val)
            root = bst.insert(root, v);
        BSTSearch searchbst = new BSTSearch();
        System.out.println("Search 4 :"+ searchbst.search(root, 4));    
        System.out.println("Search 12 :"+ searchbst.search(root, 12));    

    }
    
}
