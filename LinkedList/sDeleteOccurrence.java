// Input: head: 2 -> 2 -> 1 -> 8 -> 2 -> NULL, key = 2
// Output:  1 -> 8 -> NULL
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class sDeleteOccurrence {
    static Node deleteAllOccurrences(Node head, int key) {
        Node curr = head, prev = null;
        while (curr != null) {
            if (curr.data == key) {

                if (prev == null) {
                    head = curr.next;
                }

                else {
                    prev.next = curr.next;
                }

                curr = curr.next;

            }

            else {

                prev = curr;
                curr = curr.next;
            }
        }
        return head;

    }
    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 2 -> 2 -> 1 -> 8 -> 2 -> NULL
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(2);

        int key = 1;

        head = deleteAllOccurrences(head, key);
        printList(head);


    }
}
