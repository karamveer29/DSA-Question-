// Design a stack with the following operations.

// push(Stack s, x): Adds an item x to stack s 
// pop(Stack s): Removes the top item from stack s 
// merge(Stack s1, Stack s2): Merge contents of s2 into s1.
import java.io.*;
import java.util.*;
class Node{
    Node next;
    Node prev;
    int data;

    Node(int val){
        data = val;
        next = null;
        prev =null;
    }
}
class Stack{
    
    private Node head;
    private Node tail;
    Stack(){
        head = null;
        tail = null;
    }
    
    public void push(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            head.next = null;
            head.prev = null;
            tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void pop(){
        if(head == null)
        System.out.println("Stack underflow");
        if(head == tail){
            head = null;
            tail = null;
        }else{
            Node n = tail;
            tail = tail.prev;
            n.prev = null;
            tail.next = null;
            
        }   
    }
    public void merge(Stack s){
        head.prev = s.tail;
        s.tail.next = head;
        head = s.head;
        s.tail = null;
        s.head = null;
    }
    public void display(){
        if(tail != null){
            Node n = tail;
            while(n != null){
                System.out.println(n.data+" ");
                n = n.prev;
            }
            System.out.println();
        }else{
            System.out.println("Stack Underflow!");
        }
    }
}


public class MergeableStack {
    public static void main(String[] args) {
        Stack ms1 = new Stack();
        Stack ms2 = new Stack();

        ms1.push(2);
        ms1.push(3);
        ms1.push(4);
        ms2.push(5);
        ms2.push(6);
        ms2.push(7);

        ms1.merge(ms2);
        ms1.display();

    }
}
