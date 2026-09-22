class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class bDoublylinkedlist {
    Node  head;
    // insert at begning
    void insertAtStart(int data){
        Node newNode = new Node(data);
        if(head != null){
            head.prev = newNode;
            newNode.next = head;
        }head = newNode;
    }
    // insert at End
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }
    // Delete at Start
    void deleteAtStart(){
        if(head == null) return;
        head = head.next;
        if(head != null)
            head.prev = null;
    }

    // Delte at End
    void deleteAtEnd(){
        if(head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            if(temp.prev != null){
                temp.prev.next = null;
            }else{
                head = null;
            }
        }
    }
    void Display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -><- ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        bDoublylinkedlist list = new bDoublylinkedlist();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(70);
        list.insertAtEnd(80);
        list.Display();
        list.deleteAtStart();
        list.Display();
        list.deleteAtEnd();
        list.Display();
    }
}