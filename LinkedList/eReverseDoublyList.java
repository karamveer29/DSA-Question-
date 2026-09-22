class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class eReverseDoublyList {
    static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node currNode = head;
        Node prevNode = null;
        while(currNode != null){
            prevNode = currNode.prev;
            currNode.prev = currNode.next;
            currNode.next = prevNode;

            currNode = currNode.prev;
        }
        head = prevNode.prev;
        return head;
    }
    static void printList(Node temp){
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        
        head = reverse(head);
        printList(head);
    }
}
