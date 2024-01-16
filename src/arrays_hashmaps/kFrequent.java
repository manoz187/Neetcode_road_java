package arrays_hashmaps;

import java.util.*;

public class kFrequent {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            Integer currentvalue = map.get(num);
            map.put(num, currentvalue + 1);
        }
        List<Integer> arrayList = new ArrayList<>(map.values());
        Collections.sort(arrayList, Collections.reverseOrder());
        List<Integer> firstk = arrayList.subList(0, Math.min(k, arrayList.size()));
        Integer[] array = firstk.toArray(new Integer[0]);
        return convertIntegerArrayToIntArray(getKeysByValues(map, array));
    }
    public static  Integer[] getKeysByValues(Map<Integer, Integer> map, Integer[] values) {
        List<Integer> keyList = new ArrayList<>();

        for (Integer value : values) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (value.equals(entry.getValue())) {
                    keyList.add(entry.getKey());
                }
            }
        }
        @SuppressWarnings("unchecked")
        Integer[] keysArray = (Integer[]) keyList.toArray(new Integer[0]);
        return keysArray;
    }

    private static int[] convertIntegerArrayToIntArray(Integer[] integerArray) {
        int[] intArray = new int[integerArray.length];

        for (int i = 0; i < integerArray.length; i++) {
            intArray[i] = integerArray[i].intValue();
        }

        return intArray;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }


}

