// example
// 1->2->3
//+ 9->9->9
// 1->1->2->2
class Node{
    int data;
    Node next;
    Node (int val){
        data = val;
        next = null;
    }
}

public class vTwoNumber {
    static Node addTwoLists(Node head1, Node head2){
        Node dummy = new Node(0);
        Node curr = dummy;

  
        int carry = 0;
        while(head1 != null || head2 != null || carry != 0){
            int sum = carry;
            if(head1 != null){
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2 != null){
                sum += head2.data;
                head2 = head2.next;
            }
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
    }
    return dummy.next;
}
static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // First number: 342
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        // Second number: 465
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        System.out.print("List 1: ");
        display(head1);

        System.out.print("List 2: ");
        display(head2);

        Node result = addTwoLists(head1, head2);

        System.out.print("Sum List: ");
        display(result);
    }
}
