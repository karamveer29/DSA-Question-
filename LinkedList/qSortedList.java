// Sorted a linked list of 0s, 1s, 2s 
// Examples: 

// Input: 1 -> 1 -> 2 -> 0 -> 2 -> 0 -> 1 -> NULL
// Output: 0 -> 0 -> 1 -> 1 -> 1 -> 2 -> 2 -> NULL
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class qSortedList {
    static void sortList(Node head){
        int[] cnt ={0, 0, 0 };
        Node ptr = head;
        while (ptr != null) {
            cnt[ptr.data] += 1;
            ptr = ptr.next;
        }
        int idx = 0;
        ptr = head;
        while ((ptr != null)) {
            if(cnt[idx] == 0){
                idx += 1;
            }else{

                ptr.data = idx;
                cnt[idx] -= 1;
                ptr = ptr.next;
            }
        }
    }
    static void printList(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);

        System.out.print("Linked List before Sorting:");
        printList(head);

        sortList(head);

        System.out.print("Linked List after Sorting:");
        printList(head);
    }
}
