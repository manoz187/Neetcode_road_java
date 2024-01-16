package arrays_hashmaps;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSeq {
    public static int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;

        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        int longest = 1;

        for (int num : nums) {
            if(!hs.contains(num-1)){
                int count = 1;

                while(hs.contains(num+1)){
                    num++;
                    count++;

                }
                longest =  Math.max(longest,count);

            }
            if(longest > nums.length/2) break;




        }
        return longest;





    }


    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(arr));
    }


}
