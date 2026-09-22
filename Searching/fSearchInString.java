import java.util.Arrays;

public class fSearchInString {
    public static void main(String[] args){
        String name = "Sharma";
        char target = 'm';

        System.out.println(Arrays.toString(name.toCharArray()));

          
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
