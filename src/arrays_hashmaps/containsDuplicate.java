package arrays_hashmaps;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] nums){

        Set<Integer> uniques = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {

            if(uniques.contains(nums[i])){
                return true;
            }
            uniques.add(nums[i]);

        }
        return false;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,1,2,5,6};
        int[] arr2 = {1,2,3,4};

        System.out.println(containsDuplcate(arr));
        System.out.println(containsDuplcate(arr2));


    }









}
