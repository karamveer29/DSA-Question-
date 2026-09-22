
// Delete consecutive same words in a sequence
import java.util.*;

public class gfg15 {
    static int removeConsecutiveSame(String[] arr) {
        // List<String> list = new ArrayList<>();
                List<String> list = new ArrayList<>(Arrays.asList(arr));

        int i = 0;
        while (i < list.size() - 1) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                list.remove(i);

                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return list.size();

    }
    public static void main(String[] args) {
        String[] arr = {"gfg", "for", "geeks", "geeks", "for"};
        System.out.println(removeConsecutiveSame(arr));
    }
}
