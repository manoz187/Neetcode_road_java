package twopointers;

import java.util.*;

public class threeSum {
    public static List<List<Integer>> threeSum_method(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> output_arr = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {


            int left = i+1;
            int right = nums.length-1;

            while(left<right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    output_arr.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else right--;

            }

        }
        return new ArrayList<>(output_arr);

    }


}
