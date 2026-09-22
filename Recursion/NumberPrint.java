public class NumberPrint {
    static void print(int n){
        if(n == 5){
            return ;
        }System.out.println(n);
        n = n + 1;
        print(n);
        
    }
    public static void main(String[] args) {
        print(0);
    }
}
