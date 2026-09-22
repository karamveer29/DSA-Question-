public class String_reverse {
    public static String revString(String str){
        if(str.length() == 1){
            return str;

        }
        char currChar = str.charAt(0);
        String nexString = revString(str.substring(1));
        return nexString+ currChar;
    }
    public static void main(String[] args) {
        String str = "abcd";
        String reversed = revString(str);
        System.out.println(reversed);
    }
}
