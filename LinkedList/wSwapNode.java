// Swap k-th Nodes in LinkedList
// example
// i/p- 5->10->8->5->9->3 k = 2
// o/p- 5->9->8->5->10->3
class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }
}
public class wSwapNode {
    static Node swapkth(Node head, int k){
      if (head == null) return head;

        // Count length
        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        if (k > n) return head;
        if (2 * k - 1 == n) return head;
        Node prevX = null;
        Node x = head;
        for (int i = 1; i < k; i++) {
            prevX = x;
            x = x.next;
        }

        
        Node prevY = null;
        Node y = head;
        for (int i = 1; i < n - k + 1; i++) {
            prevY = y;
            y = y.next;
        }

    
        if (prevX != null) prevX.next = y;
        if (prevY != null) prevY.next = x;
        Node tempNext = x.next;
        x.next = y.next;
        y.next = tempNext;

        if (k == 1) head = y;
        if (k == n) head = x;

        return head;
    }
    static void printList(Node curr){
        while ( curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(8);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(3);

        int k = 2;
        head = swapkth(head, k);

        printList(head);
    }
}
