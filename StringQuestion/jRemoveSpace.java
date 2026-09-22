import java.util.*;
public class jRemoveSpace{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }

        System.out.println("After removing spaces: " + result);
    }
}