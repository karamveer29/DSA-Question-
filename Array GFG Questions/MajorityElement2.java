// Examples:

// Input: arr[] = {2, 2, 3, 1, 3, 2, 1, 1}
// Output: {1, 2}
// Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).


// Input: arr[] = {-5, 3, -5}
// Output: {-5}
// Explanation: The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).


// Input: arr[] = {3, 2, 2, 4, 1, 4}
// Output: { }
// Explanation: There is no majority element.

// Steps:

// Initialize two variables ele1 = -1 and ele2 = -1, for candidates and two 
// variables cnt1 = 0 and cnt2 = 0, for counting.
// In each iteration,
// (1)-If an element is equal to any candidate, update that candidate’s count.
// (2)-If count of a candidate reaches zero then replace 
// that candidate with current element.
// (3)-If neither candidate matches and both counts are non zero, 
// decrement the counts.
// After this, in second pass we check if the chosen 
// candidates appear more than n/3 times in the array. If they do then include them 
// in result array.

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    static List<Integer> findmajority(int[] arr){
        int n = arr.length;
        int ele1 = -1, ele2 = -1;
        int cnt1 = 0 , cnt2 = 0;
        for(int ele : arr){
            // incremenent count candidate 1
            if(ele1 == ele){
                cnt1++;
                //  incremenent count candidate 2
            }else if(ele2 == ele){
                cnt2++;
            }else if(cnt1 == 0){
                ele1 = ele;
                cnt1++;
            }else if(cnt2 == 0){
                ele2 = ele;
                cnt2++;
            }else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        // count the occurance
        for(int ele : arr){
            if(ele1 == ele) cnt1++;
            if(ele2 == ele) cnt2++;
            
        }
        // Add to result if they are majority elements
        if (cnt1 > n / 3) res.add(ele1);
        if (cnt2 > n / 3 && ele1 != ele2) res.add(ele2);
        
        if (res.size() == 2 && res.get(0) > res.get(1)) {
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,1,3,2,1,1};
        List<Integer> res = findmajority(arr);
        for(int ele : res){
            System.out.print(ele+" ");
        }
    }
}
