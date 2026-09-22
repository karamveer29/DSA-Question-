public class cCircularQueue {
    int[] q;
    int front, rear, size;
    cCircularQueue(int size){
        this.size = size;
        q = new int[size];
        front = rear = -1;
    }
    void enqueue(int x){
        if((rear + 1) % size == front){
            System.out.println("Queue Overflow");
            return;
        }
        if(front == -1) front = 0;
        rear = (rear + 1) % size;
        q[rear] = x;
    }
    void dequeue() {
        if(front == -1){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(q[front] + "dequeued");
        if(front == rear)
            front = rear = -1;
        else
            front = (front + 1) % size;
    }
    
    public static void main(String[] args) {
        cCircularQueue cq = new cCircularQueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.dequeue();
        cq.enqueue(4);
        cq.enqueue(5);
    }
}
