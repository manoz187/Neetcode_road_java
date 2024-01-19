package twopointers;

import java.util.*;

public class threeSum {
    public static List<List<Integer>> threeSum_method(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> output_arr = new LinkedList<List<Integer>>();

        for (int i = 0; i < nums.length-2; i++) {

            if(i==0||(i>0 && nums[i] != nums[i-1])){
                int target = 0-nums[i];
                int left = i+1;
                int right = nums.length-1;

                while(left<right){
                    if(nums[left]+nums[right]==target){
                        output_arr.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right-1]) right--;

                    }
                    else if(nums[left]+nums[right]>target) right--;

                    else left++;
                }


            }


        }
        return output_arr;


    }




}
