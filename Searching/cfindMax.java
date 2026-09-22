public class cfindMax {
    public static void main(String[] args) {
        int[] arr = { 18, 12, 7, 3, 14, 28 };
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int n = arr.length;
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
