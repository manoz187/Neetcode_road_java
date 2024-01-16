package arrays_hashmaps;

import java.util.Arrays;

public class productOfArray {

    public static int[] productExceptSelf(int[] nums) {

        int prefix = 1;
        int postfix = 1;
        int[] res = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            res[i]=prefix;
            prefix*=nums[i];

        }

        for (int i = nums.length-1; i >= 0 ; i--) {
            res[i]*=postfix;
            postfix*=nums[i];
        }

        return res;


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
