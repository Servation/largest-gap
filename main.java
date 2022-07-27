import java.util.*;

public class main {
    public static void main(String[] args) {
        // Given an array of integers, return the largest gap between the sorted elements of the array.

        int[] nums = {9,4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        Arrays.sort(nums);
        int largestGap = 0;
        for(int i = 1; i < nums.length; i++) {
            int i1 = nums[i] - nums[i - 1];
            if (i1 > largestGap) {
                largestGap = i1;
            }
        }
        System.out.println(largestGap);
    }
}
