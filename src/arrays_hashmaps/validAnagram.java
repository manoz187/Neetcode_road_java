package arrays_hashmaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class validAnagram {

    public static boolean isAnagram(String s, String t) {

        char[] charArray_s = s.toCharArray();
        char[] charArray_t = t.toCharArray();

        if (s.length()!=t.length()){
            return false;
        }

        Arrays.sort(charArray_s);
        Arrays.sort(charArray_t);

        return Arrays.equals(charArray_s,charArray_t);


    }


    public static boolean isAnagram2(String s, String t){

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i)-'a']++;
            store[t.charAt(i)-'a']--;
        }

        for (int n : store) {
            if(n!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String m = "nagaram";
        String n = "anagram";

        System.out.println(isAnagram2(m,n));
    }


}
