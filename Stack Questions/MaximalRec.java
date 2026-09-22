// Maximal rectangle 
// Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
// Output: 6
// Explanation: The maximal rectangle is shown in the above picture.
// Example 2:

// Input: matrix = [["0"]]
// Output: 0
// Example 3:

// Input: matrix = [["1"]]
// Output: 1

import java.util.Stack;

public class MaximalRec {
    public int rectangle(char[][] matrix){
        if(matrix.length == 0) return 0;
        int col = matrix[0].length;
        int[] heights = new int[col];
        int maxArea = 0;
        for(char[] row: matrix){
            for(int i=0; i<col; i++){
                if(row[i] =='1'){
                    heights[i] += 1;
                }else{
                    heights[i] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }
    private int largestRectangleArea(int[] heights){
        Stack<Integer> st = new Stack<>();
                int max = 0;
        int[] h = new int[heights.length + 1];

        System.arraycopy(heights, 0, h, 0, heights.length);

        for (int i = 0; i < h.length; i++) {
            while (!st.isEmpty() && h[i] < h[st.peek()]) {
                int height = h[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                max = Math.max(max, height * width);
            }
            st.push(i);
        }

        return max;
    }
    
    public static void main(String[] args) {
        MaximalRec obj = new MaximalRec();
          char[][] matrix = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        System.out.println("Maximal Rectangle Area"+obj.rectangle(matrix));
    }
}
