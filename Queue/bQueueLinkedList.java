class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class bQueueLinkedList {
    Node front, rear;
    void enqueue(int x){
        Node newNode = new Node(x);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.data + " dequeued");
        front = front.next;
        if (front == null) rear = null;
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        bQueueLinkedList q = new bQueueLinkedList();
        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);
        q.display();
        q.dequeue();
        q.display();
    }
}
