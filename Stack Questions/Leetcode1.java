public class Leetcode1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            int j = 0;

            // Find the index of current element in nums2
            while (j < nums2.length && nums2[j] != current) {
                j++;
            }

            // Search for the next greater element
            int nextGreater = -1;
            for (int k = j + 1; k < nums2.length; k++) {
                if (nums2[k] > current) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            result[i] = nextGreater;
        }

        return result;
    }

    public static void main(String[] args) {
         int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);
        System.out.println("Next greater elements:");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
