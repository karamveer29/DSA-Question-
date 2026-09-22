// Given a square matrix mat[][] of size n x n, such that mat[i][j] = 1 
// means ith person knows jth person, the task is to find the celebrity.
// Examples:  

// Input: mat[][] = [[1, 1, 0], 
//                              [0, 1, 0], 
//                              [0, 1, 1]]
// Output: 1
// Explanation: 0th and 2nd person both know 1. Therefore, 1 is the celebrity.

// Input: mat[][] = [[1, 1], 
//                             [1, 1]]
// Output: -1
// Explanation: The two people at the party both know each other. None of them is a celebrity.

// Input: mat[][] = [[1]]
// Output: 0
public class Clebrity_prob {
    static int celebrity(int[][] mat){
        int n = mat.length;
        int[] indegree = new int[n];
        int[] outdegree = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int x=mat[i][j];

                outdegree[i] += x;
                indegree[j] += x;
            }
        }
        for(int i=0;i<n;i++)
            if(indegree[i] == n-1 && outdegree[i] == 0)
                return i;

            return -1;    

    }
    public static void main(String[] args) {
        int[][] mat = {{0,1,0},
    {0,0,0},
    {0,1,0}};
    System.out.println(celebrity(mat));
    }
}
