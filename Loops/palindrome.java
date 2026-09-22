public class palindrome {
    public static void main(String[] args) {
        int num = 131; 
        int temp = num;
        int rev = 0;
        while(temp > 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;

        }
        System.out.println(num);
        if(num == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
