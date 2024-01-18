package twopointers;

public class validPalindrome {
    public static boolean isPalindrome(String s) {

        String cleanedString = s.replaceAll("[^a-zA-Z0-9]","");
        char[] chararray =  cleanedString.toCharArray();

        for (int i = 0; i < chararray.length; i++) {
            if(!(Character.toLowerCase(chararray[i]) ==Character.toLowerCase(chararray[(chararray.length-1)-i]))){
                return false;

            }

        }
        return true;

    }

    public static void main(String[] args) {
        java.lang.String s1 = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s1));
    }


}
