import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

import java.util.ArrayList;
import java.util.List;

public class mmajority2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<Integer> result = findMajorityElement(nums);
        System.out.println("Majority Element : " + result);
    }
    static List<Integer> findMajorityElement(int[] nums){
        int count1 = 0, count2 = 0;
        Integer cand1 = null, cand2 = null;
        for(int num : nums){
            if(cand1 != null && num == cand1){
                count1++;
            }else if(cand2 != null && num == cand2){
                count2++;
            }else if(count1 == 0){
                cand1 = num;
                count1 = 1;
            }else if(count2 == 0){
                cand2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == cand1) count1++;
            else if(num == cand2) count2++;
        }
        List<Integer> result = new ArrayList<>();
        int limit = nums.length / 3;
        if(count1 >limit) result.add(cand1);
        if(count2 > limit) result.add(cand2);
        return result;
    }
}
