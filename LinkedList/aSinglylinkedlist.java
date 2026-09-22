import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class aSinglylinkedlist {
    Node head;
    // Insert at begining
    void insetAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // Insert at the End
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    // delete At Begning
    void deleteAtStart(){
        if(head == null){
            System.out.println("Life is empty");
            return;
        }
        head = head.next;
    }
    // delete at End
    void deleteAtEnd(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }
    // Display List 
    void Display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        aSinglylinkedlist list = new aSinglylinkedlist();
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