//https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String string) {
        int l = string.length();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<l;i++){
            char ch = string.charAt(i);
            if(ch == '[' || ch == '{' || ch == '(') s.push(ch);
            else{
                if(s.isEmpty())    return false;
                char top = s.pop();
                if(top != '[' && ch == ']'){return false;}
                else if(top != '{' && ch == '}'){return false;}
                else if(top != '(' && ch == ')'){return false;}
            }
        }
        return s.isEmpty();
    }
}