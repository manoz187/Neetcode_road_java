package twopointers;
import java.util.HashMap;
public class twosumII {
    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();

        for (int i = 0; i < numbers.length ; i++) {

            int diff = target - numbers[i];

            if(map1.contains(diff)){
                int res = map1.get(diff);
                return new int[]{i,diff};
            }
            map1.add(numbers[i],i);

        }
        return new int[]{};

    }

    public static  void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(arr,target));

    }
}
