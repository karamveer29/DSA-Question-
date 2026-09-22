// Traversal of Circular LinkedList
class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class kCircularList {
    static void printList(Node curr, Node head){
        if(head == null) return;
        System.out.print(curr.data+" ");
        if(curr.next == head)
            return;
        printList(curr.next, head);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(14);
        // System.out.print("list is: ");
        // printList(head, head);
        

        head.next.next.next.next.next = head;
        printList(head, head);
        
    }
}
