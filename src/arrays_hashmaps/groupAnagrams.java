package arrays_hashmaps;
import java.util.*;

public class groupAnagrams {

    public static List<List<String>> groupAnagrams1(String[] strs) {

        Map <String,List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String word = strs[i];
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!map.containsKey(sorted)){

                map.put(sorted,new ArrayList<>());
            }

            map.get(sorted).add(word);



        }

        return new ArrayList<>(map.values());





    }


}
