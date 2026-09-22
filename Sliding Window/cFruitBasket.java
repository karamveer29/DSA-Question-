import java.util.Scanner;

public class cFruitBasket {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] fruits = new char[n];
        for (int i = 0; i < n; i++)
            fruits[i] = sc.next().charAt(0);

        char fruit1 = 0, fruit2 = 0;
        char lastFruit = 0;

        int lastFruitCount = 0;
        int currentWindow = 0;
        int maxFruits = 0;

        for (int i = 0; i < n; i++) {
            char curr = fruits[i];

           
            if (curr == fruit1 || curr == fruit2) {
                currentWindow++;
            } 
         
            else {
                currentWindow = lastFruitCount + 1;
            }

            if (curr == lastFruit) {
                lastFruitCount++;
            } else {
                lastFruitCount = 1;
                lastFruit = curr;
            }

            // Update fruit types
            if (fruit1 == 0 || fruit1 == curr)
                fruit1 = curr;
            else if (fruit2 == 0 || fruit2 == curr)
                fruit2 = curr;
            else {
                fruit1 = lastFruit;
                fruit2 = curr;
            }

            maxFruits = Math.max(maxFruits, currentWindow);
        }

        System.out.println("Fruits: "+maxFruits);
    }
}
