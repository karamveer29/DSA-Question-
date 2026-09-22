class Node{
    int data;
    Node next;
    Node(int newValue){
        data = newValue;
        next = null;
    }
}
class Pair {
    Node first;
    Node second;
    Pair(Node first, Node second){
        this.first = first;
        this.second = second;
    }
}
public class tSplitList {
    static Pair splitData(Node head){
        Node slow = head;
        Node fast = head;
        if(head == null){
            return new Pair(null, null);
        }while (fast.next != head && fast.next != null) {
            fast =fast.next.next;
            slow = slow.next;
        }
        if(fast.next.next == head){
            fast = fast.next;
        }
        Node head1 = head;
        Node head2 = slow.next;
        fast.next = slow.next;
        slow.next = head;
        return new Pair(head1, head2);
    }
    static void printList(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head1 = null;
        Node head2 = null;

        // Created linked list will be 1->2->3->4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;

        Pair result = splitData(head);
        head1 = result.first;
        head2 = result.second;

        printList(head1);
        printList(head2);
    }
}
