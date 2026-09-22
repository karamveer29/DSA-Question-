// Rotated doubly linkedlist by N node
class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
public class xRotatedDLL {
    static Node rotatedList(int p, Node head){
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.prev = tail;
        for(int i = 1; i<=p; i++){
            head = head.next;
            tail = tail.next;
        }
        tail.next = null;
        head.prev = null;
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
       Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        int p = 2;
        head = rotatedList(p, head);
        printList(head); 
    }
}
