class Node {
    int data;
    Node right, down;
    Node(int data){
        this.data = data;
        this.right = null;
        this.down = null;
    }
}
public class y2DList {
    static Node constructUtil(int[][] arr, int i, int j){
        if(i >= arr.length || j >= arr[0].length){
            return null;
        }
        Node curr = new Node(arr[i][j]);
        curr.right = constructUtil(arr, i, j+1);
        curr.down = constructUtil(arr, i+1, j);
        return curr;
    }
    static Node construct(int[][] arr){
        return constructUtil(arr, 0, 0);
    }
    static void printList(Node head) {
        Node currRow = head;
        while (currRow != null) {
            Node currCol = currRow;
            while (currCol != null) {
                System.out.print(currCol.data + " ");
                currCol = currCol.right;
            }
            System.out.println();
            currRow = currRow.down;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Node head = construct(arr);
        printList(head);
    }
}
