public class Functioncall {
    public static void modify(int a){
        a = a + 5;
    }
    public static void main(String[] args) {
        int num = 10;
        modify(num);
        System.out.println(num);
    }
}
