import java.util.*;
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
public class Tree_02 {
    public List<Integer> preorderTraversal(TreeNode root){
    List<Integer> preorder = new ArrayList<>();
    if(root == null){
        return preorder;
    }
    Stack<TreeNode> st = new Stack<>();
    st.push(root);
    while (!st.empty()) {
        root = st.pop();
        preorder.add(root.val);
        if(root.right != null){
            st.push(root.right);
        }
        if(root.left != null){
            st.push(root.left);
        }
    }
    return preorder;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Tree_02 sol = new Tree_02();
        List<Integer> result = sol.preorderTraversal(root);
        System.out.println("Preorder Traversal: ");
        for(int val : result){
            System.out.print(val+" ");

        }
        System.out.println();
    }
}
