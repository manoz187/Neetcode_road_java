package twopointers;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosumII {
    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < numbers.length ; i++) {

            int diff = target - numbers[i];

            if(map.containsKey(diff)){
                int res = map.get(diff);
                return new int[]{res+1,i+1};
            }
            map.put(numbers[i],i);

        }
        return new int[]{};

    }

    public static  void main(String[] args) {
        int[] arr = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
}
