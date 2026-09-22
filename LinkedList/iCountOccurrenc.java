// Count the occurences in linkedList
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class iCountOccurrenc {
    static int count(Node head, int key){
        Node curr = head;
        int count = 0;
        while (curr != null) {
            if(curr.data == key){
                count++;
            }curr = curr.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        int key = 3;
        System.out.println(count(head, key));
    }
}
