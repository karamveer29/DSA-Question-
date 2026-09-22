// Length of cycle in Linked list
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class nLength {
    static int countNodes(Node node){
        int res = 1;
        Node curr = node;
        while (curr.next != node) {
            res++;
            curr = curr.next;
        }
        return res;
    }
    static int lengthofLoop(Node head){
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return countNodes(slow);
        }
        return 0;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = head.next.next;
        System.out.println(lengthofLoop(head));
    }
}
