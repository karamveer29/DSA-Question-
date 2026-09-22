// Delte N nodes after M nodes of LikedList
// example
// Input: Linked List: 9->1->3->5->9->4->10->1, n = 1, m = 2
// Output: 9->1->5->9->10->1

import javax.swing.text.View;

class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
public class zSkipList {
    static Node skipMdeleteN(Node head, int m, int n){
         Node curr = head; // Current node pointer
        Node t; // Temporary node pointer
        int count; 
        while (curr != null) {

            // Skip m nodes
            for (count = 1; count < m && curr != null;
                 count++)
                curr = curr.next;

            // If end of the list is reached, return the

            if (curr == null)
                return head;


            t = curr.next;
            for (count = 1; count <= n && t != null;
                 count++) {
                Node temp = t;
                t = t.next;

                // Dereference the node for garbage
                // collection
                temp = null;
            }

            // Link the current node to the remaining list
            curr.next = t;


            curr = t;
        }

        return head;


    }
    static void printList(Node head)
    {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         // Create the following linked list:
        // 1->2->3->4->5->6
        // Node head = new Node(9);
        // head.next = new Node(1);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(5);
        // head.next.next.next.next = new Node(9);
        // head.next.next.next.next.next = new Node(4);
        // head.next.next.next.next.next.next = new Node(10);
        // head.next.next.next.next.next.next.next = new Node(1);
         Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);


        int m = 2, n = 2;
        head = skipMdeleteN(head, m, n);
        printList(head);
    }
}
