
// Input: C (a pointer to C)
// Output: A-->B-->D-->E-->F

// Input: A (a pointer to A)
// Output: B-->D-->E-->F
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class oNodeList {
    Node head;

    void deleteNodeWithoutHead(Node pos) {
        if (pos == null)
            return;
        else if (pos.next == null) {
            System.out.println("This is last node, required head can't be freed");
            return;
        }
        pos.data = pos.next.data;
        pos.next = pos.next.next;
    }

    public void push(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        oNodeList llist = new oNodeList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        System.out.println("Initial Linked List : ");
        llist.printList();

        // Delete 15 without sending head
        Node del = llist.head.next;

        // Function call
        llist.deleteNodeWithoutHead(del);

        // Print the final Linked List
        System.out.println("Final Linked List after deletion of 15 : ");
        llist.printList();
    }
}
