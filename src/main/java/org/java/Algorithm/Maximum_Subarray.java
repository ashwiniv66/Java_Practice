package org.java.Algorithm;

public class Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int current_max = nums[0];
        int max_so_far = nums[0];

        if(nums.length == 0 || nums == null){
            return 0;
        }
        for(int i =1 ; i<nums.length-1 ;i++){
            current_max = Math.max(nums[i] , current_max+nums[i]);
            max_so_far = Math.max(max_so_far,current_max);
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("The maximum subarray : " + maxSubArray(nums) );
    }

}
