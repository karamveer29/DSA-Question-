class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class cMiddleElement{
    // approach 1 
    // static int length(Node head){
    //     int length = 0;
    //     while(head != null){
    //         length++;
    //         head = head.next;
    //     }
    //     return length;
    // }
    // static int getMiddle(Node head){
    //     int length = length(head);
    //     int midIdx = length/2;
    //     while (midIdx > 0) {
    //         head = head.next;
    //         midIdx--;
    //     }
    //     return head.data;
    // }

    // approach 2
    static int getMiddle(Node head){
        Node slowptr = head;
        Node fastptr = head;
        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        return slowptr.data;
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
