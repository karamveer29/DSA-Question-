public class aQueueArray {
// class QueueArray{
    int[] q;
    int front, rear, size;
    aQueueArray(int size){
        this.size = size;
        q = new int[size];
        front = rear = -1;
    }
        void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        q[++rear] = x;
        System.out.println(x + " enqueue ");
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(q[front++] + " dequeued");
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(q[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        aQueueArray q = new aQueueArray(5); 
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }

    
}