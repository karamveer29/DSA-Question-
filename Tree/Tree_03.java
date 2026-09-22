import java.util.ArrayList;
import java.util.List;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
        left = null;
        right = null;
    }
}

public class Tree_03 {
    public static void inorder(TreeNode root, List<Integer> arr){
        if(root == null){
            return;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public static List<Integer> inorder(TreeNode root){
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        
        List<Integer> result = inorder(root);
        System.out.println("Inorder Traversal: ");
        for(int val : result){
            System.out.print(val+" ");

        }
        System.out.println();
    }
}
