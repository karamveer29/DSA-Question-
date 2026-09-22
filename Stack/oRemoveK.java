public class oRemoveK {
    public String removeKDigit(String nums, int k) {
        int n = nums.length();
        if (k == n)
            return "0";

        char[] stack = new char[n];
        int top = 0;
        for (int i = 0; i < n; i++) {
            char c = nums.charAt(i);
            while (top > 0 && k > 0 && stack[top - 1] > c) {
                top--;
                k--;
            }
            stack[top++] = c;
        }
        top -= k;
        int start = 0;
        while (start < top && stack[start] == '0') {
            start++;
        }
        if (start == top) {
            return "0";
        } else {
            return new String(stack, start, top - start);
        }

    }

    public static void main(String[] args) {
          oRemoveK solution = new oRemoveK();

        System.out.println(solution.removeKDigit("1432219", 3));  // Output: 1219
        System.out.println(solution.removeKDigit("10200", 1));    // Output: 200
        System.out.println(solution.removeKDigit("10", 2));       // Output: 0
        System.out.println(solution.removeKDigit("1234567890", 9)); 
    }

}
