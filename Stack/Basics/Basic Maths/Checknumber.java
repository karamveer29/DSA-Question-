public class Checknumber {
    static boolean palindrome(int n){
        int revnum = 0;
        int dup = n;
        while(n>0){
            int d = n% 10;
            revnum = (revnum * 10) + d;
            n = n /10;
        }
            if(dup == revnum){
                return true;
            }else{
                return false;
            }
    }
    public static void main(String[] args) {
        int number = 455;
        if(palindrome(number)){
            System.out.println(number+ " number is palindrome");
        }else{
            System.out.println(number+" number is not palindrome");
        }
    }
}
