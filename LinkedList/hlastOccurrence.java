class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class hlastOccurrence {
    static Node deleteLastOccurrence(Node head, int key){
        Node last = null, lastprev = null;
        Node curr = head, prev = null;
        while(curr!= null){
            if(curr.data == key){
                lastprev = prev;
                last = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        if(last != null){
            if(lastprev != null){
                lastprev.next = last.next;
            }else{
                head=head.next;
            }
        }
        return head;
    }
    static void printList(Node curr){
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(7);
        int key = 7;
        head = deleteLastOccurrence(head, key);
        printList(head);
    }
}
