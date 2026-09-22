class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class y1DList {
    static Node create1D(int[] arr, int idx){
        int n = arr.length;
        if(idx  == n) return null;
        Node newnNode = new Node(arr[idx]);
        newnNode.next = create1D(arr, idx+1);
        return newnNode;
        
        
    }

    static void display(Node head){
        while (head != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] matrix1D = {10, 20, 30, 40};

        Node head = create1D(matrix1D, 0);

        // System.out.print("1D Matrix using Linked List: ");
        display(head);
    }
}
