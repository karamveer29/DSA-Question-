public class NamePrint {
    static void func(int n, int i){
          
            // Base Condition.
            if(i>n) return;
            System.out.println("Raj");

            // Function call to print till i increments.
            func(i+1,n);

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 4.
       int n = 4;
       func(1,n);
    }
}
