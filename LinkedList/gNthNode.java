// Program for Nth node from the end of Linked List
// Input: 1 -> 2 -> 3 -> 4, N = 3
// Output: 2
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class gNthNode {
    static int nthFromEnd(Node head, int N){
        Node mainptr = head;
        Node refptr = head;
        for(int i=1; i<N; i++){
            refptr = refptr.next;
            if(refptr == null){
                return -1;
            }
        }
        while (refptr.next != null) {
            refptr = refptr.next;
            mainptr = mainptr.next;
        }
        return mainptr.data;
    }
    public static void main(String[] args) {
         // Create a hard-coded linked list:
        // 35 -> 15 -> 4 -> 20
        Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        System.out.println(nthFromEnd(head, 4));
    }
}
