// package Tree;
class Node{
    int data;
    Node left , right;
    public Node(int val){
        data = val;
        left =right = null;
    }
}
public class TreeTraversal {
    Node root;
    void inOrder(Node node){
        if(node == null)
        return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);

        System.out.print("Inorder traversal: ");
        tree.inOrder(tree.root);
        System.out.println();

         System.out.print("Preorder traversal: ");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postOrder(tree.root);
        System.out.println();
        
    }
}


// inorder
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> arr = new LinkedList<>();
//         inorder(root, arr);
//         return arr;
//     }

//     private void inorder(TreeNode node, List<Integer> arr) {
//         if (node == null) return;
//         inorder(node.left, arr);
//         arr.add(node.val);
//         inorder(node.right, arr);
//     }
// }
// // preorder
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> arr = new LinkedList<>();
//         preorder(root, arr);
//         return arr;
//     }

//     private void preorder(TreeNode node, List<Integer> arr) {
//         if (node == null) return;
//         arr.add(node.val);
//         preorder(node.left, arr);
//         preorder(node.right, arr);
//     }
// }
// // postorder
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> arr = new LinkedList<>();
//         postorder(root, arr);
//         return arr;
//     }

//     private void postorder(TreeNode node, List<Integer> arr) {
//         if (node == null) return;
//         postorder(node.left, arr);
//         postorder(node.right, arr);
//         arr.add(node.val);
//     }
// }


