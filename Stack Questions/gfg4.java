// Implement two Stacks in an Array
// Input: push1(2), push1(3), push2(4), pop1(), pop2(), pop2()
// Output: [3, 4, -1]
// Explanation: push1(2) the stack1 will be [2]
//                         push1(3) the stack1 will be [2,3]
//                         push2(4) the stack2 will be [4]
//                         pop1() the popped element will be 3 from stack1 and stack1 will be [2]
//                         pop2() the popped element will be 4 from stack2 and now stack2 is empty
//                         pop2() the stack2 is now empty hence returned -1
import java.util.Arrays;

public class gfg4 {
    
        int[] arr;
        int size;
        int top1, top2;
    
        
    
    public gfg4(int n){
        size = n;
        arr = new int[n];
        top1 = n / 2 + 1;
        top2 = n / 2;
    }
    void push1(int x){
        if(top1 < size){
            arr[top1++] = x;
        }else{
            System.out.println("Stack Overflow for stack1");
        }
    }
    void push2(int x){
        if(top2 >= 0){
            arr[top2--] = x;
        }else{
            System.out.println("Stack Overflow for stack2");
        }
    }
    int pop1(){
        if(top1 > size / 2){
            return arr[--top1];
        }else{
            return -1;
        }
    }
    int pop2(){
        if(top2 < size / 2){
            return arr[++top2];
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        gfg4 s = new gfg4(5);
        s.push1(2);
        s.push1(3);
        s.push2(4);
        System.out.println(s.pop1()+" ");
        System.out.println(s.pop2()+" ");
        System.out.println(s.pop2()+" ");
    }
}
