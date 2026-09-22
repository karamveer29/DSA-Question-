class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    Node top;

    // Push
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed");
    }

    // Pop
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data + " popped");
        top = top.next;
    }

    // Peek
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + top.data);
    }

    // Display
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLinkedList st = new StackLinkedList();

        st.push(5);
        st.push(15);
        st.push(25);

        st.display();
        st.pop();
        st.peek();
        st.display();
    }
}
