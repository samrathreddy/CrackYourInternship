//https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
        String temp="",res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                temp+=s.charAt(i);
            }else{
                if (!temp.isEmpty()) {
                    res=temp+" "+res;
                    temp="";
                }
            }
        }
        res=temp+" "+res; //Last word
        return res.trim();
    }
}
