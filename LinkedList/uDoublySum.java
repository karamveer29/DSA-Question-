class Node{
    int data;
    Node next, prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class uDoublySum {
    static Node head;
    static void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        } Node temp = head;
        while(temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

    }
    static void findPairs(int sum){
        if(head == null) return;
        Node left = head;
        Node right = head;
        while (right.next != null) {
            right = right.next;
        }

        boolean found = false;
        while (left != right && right.next != left) {
            int currSum = left.data + right.data;
            if(currSum == sum){
                System.out.println("(" + left.data + ", " + right.data + ")");
                found = true;
                left = left.next;
                right = right.prev;

            }
            else if(currSum < sum){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
        if(!found)
            System.out.println("No pair found");
        
    }
    static void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        insertEnd(1);
        insertEnd(2);
        insertEnd(4);
        insertEnd(5);
        insertEnd(6);
        insertEnd(8);
        insertEnd(9);

        System.out.print("Doubly Linked List: ");
        display();

        int targetSum = 7;
        System.out.println("Pairs with sum " + targetSum + ":");
        findPairs(targetSum);
    }
}
