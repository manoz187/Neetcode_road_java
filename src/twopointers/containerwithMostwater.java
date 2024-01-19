package twopointers;

public class containerwithMostwater {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int res =0;

        while(left < right){

            int container_length = right-left;
            int area = container_length*Math.min(height[left],height[right]);

            res = Math.max(area,res);

            if(height[left]<height[right]) left++;

            else right--;

        }

        return res;

    }



}
