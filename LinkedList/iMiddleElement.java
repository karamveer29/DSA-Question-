// Insertion and Deletions of Middle Element
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class iMiddleElement {
    static Node head;

    static void insertMiddle(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = newNode;
        newNode.next = slow;
    }

    // delete at Middle
    
    static void deleteMiddle(){
        if(head == null || head.next == null){
            head = null;
            return;

        }
        Node slow = head, fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Before Insert: ");
        display();

        insertMiddle(25);

        System.out.print("After Insert: ");
        display();

        System.out.print("Before Deletion: ");
        display();
        deleteMiddle();
        System.out.print("After Deletion: ");
        display();
    }
}