public class countDigit {
    public static int countDigit(int n){

        
        int cnt = 0;
        while(n > 0){
            cnt = cnt + 1;
            n = n/10;
        }
        return cnt;
    }
        public static void main(String[] args) {
            int N =534524636;
            System.out.println("N:"+N);
            int digits = countDigit(N);
            System.out.println("Number of Digits in N:"+digits);
    }
}