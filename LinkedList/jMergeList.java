// Merge a linked list into another linked list
// Example:

// Input: head1: 1->2->3 , head2: 4->5->6->7->8
// Output: head1: 1->4->2->5->3->6 , head2: 7->8
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class jMergeList {
    static Node mergeList(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node tail = dummy;
        Node p1 = head1;
        Node p2 = head2;
        while (p1 != null && p2 != null) {
            if(p1.data <= p2.data){
                tail.next = p1;
                p1 = p1.next;
            }else{
                tail.next = p2;
                p2 = p2.next;
            }tail = tail.next;
        }
        if(p1 != null)
            tail.next = p1;
        else
            tail.next = p2;
        return dummy.next;
    }
    static void printList(Node head){
        while (head != null) {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // first list 
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // second list
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.print("List 1: ");
        printList(head1);

        System.out.println("List 2: ");
        printList(head2);

        Node mergeHead = mergeList(head1, head2);
        System.out.println("Merged List: ");
        printList(mergeHead);
    }
}
