//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())   return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(needle.charAt(0)==haystack.charAt(i)){
                    String temp = haystack.substring(i,i+needle.length());
                    if(temp.equals(needle)) return i;
                }
        }
        return -1;
    }
}