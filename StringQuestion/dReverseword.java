import java.util.Scanner;

public class dReverseword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();

        // String[] word = s.split(" ");
        // String result = "";
        // for(int i = word.length-1; i>=0; i--){
        //     result += word[i];
        //     if(i != 0){
        //         result += " ";
        //     }
        // }
        // System.out.println(result);
        String[] words = s.split(" ");
        System.out.println("Reverse word = ");
        for(int i=words.length - 1; i>=0; i--){
            System.out.print(words[i] + " ");
        }
    }
}
