/*
 * LeetCode question 28. Find the index of the first occurrence in a String.
 * 
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class strStr {
    public int strStr(String haystack, String needle){
        if(needle.length() == 0){
            return 0;
        }

        if(haystack.length() < needle.length()){
            return -1;
        }

        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int j = 0;
            while(j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
            }
        }

        return -1;
    }
}
