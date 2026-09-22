class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class cMiddleElement {
    static int length(Node head){
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        return length;
    }
    static int getMiddle(Node head){
        int length = length(head);
        int midIdx = length/2;
        while (midIdx > 0) {
            head = head.next;
        }
        return head.data;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        // head.next.next.next.next.next = new Node(10);
        System.out.println(getMiddle(head));
    }
}
