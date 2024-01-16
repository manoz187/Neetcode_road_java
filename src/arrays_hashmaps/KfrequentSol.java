package arrays_hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KfrequentSol {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> count = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length+1];

        for (int num : nums){

            count.merge(num,1,Integer::sum);

        }

        for (int key : count.keySet()) {
            int frequency = count.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);

        }

        int index = 0;
        int[] res= new int[k];
        for (int i = nums.length; i >= 0; i--) {
            if(bucket[i]!=null){
                for(int val : bucket[i]){
                    res[index++]=val;
                    if(index==k){
                        return res;
                    }
                }
            }

        }
        return res;



    }







}
