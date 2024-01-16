package arrays_hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {

    public static int[] twoSum(int[] nums, int target) {


        HashMap<Integer,Integer> prevmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int diff = target - num;

            if (prevmap.containsKey(diff)){
                return new int[] {prevmap.get(diff),i};
            }

            prevmap.put(num,i);

        }

        return new int[]{};






    }


    public static void main(String[] args) {

        int[] arr = {1,4,6,7};

        int target = 10;

        System.out.println(Arrays.toString(twoSum(arr,target)));
    }



    }
