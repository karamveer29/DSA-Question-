// Reverse a stack without using extra space in O(n)
// Examples:  

// Input : 1->2->3->4
// Output : 4->3->2->1

// Input :  6->5->4
// Output : 4->5->6
class StackNode{
    int data;
    StackNode  next;
    public StackNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class Reverse {
    StackNode top;
    public void push(int data){
        if(this.top == null){
            top = new StackNode(data);
            return;
        }
        StackNode s = new StackNode(data);
        s.next = this.top;
        this.top = s;
    }
    public StackNode pop(){
        StackNode s = this.top;
        this.top = this.top.next;
        return s;
    }
    public void display(){
        StackNode s = this.top;
        while (s != null) {
            System.out.println(s.data+" ");
            s = s.next;
        }
        System.out.println();
    }
    public void reverse(){
        StackNode prev, cur, suc;
        cur = prev = this.pop();
        cur = cur.next;
        prev.next = null;
        while (cur != null) {
            suc = cur.next;
            cur.next = prev; 
            prev = cur;
            cur = suc;
        }
        this.top = prev;
    }
    public static void main(String[] args) {
        Reverse s = new Reverse();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Orginal Stack");
        s.display();

        s.reverse();
        System.out.println("Reversed Stack");
        s.display();
    }
}
