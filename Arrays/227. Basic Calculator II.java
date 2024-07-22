//https://leetcode.com/problems/basic-calculator-ii/


class Solution {
    public int calculate(String str) {
        Stack<Integer> s = new Stack();
        int num = 0;
        char op = '+';
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+c-'0';
            }
            if(!Character.isDigit(c)  && c != ' ' || i == str.length()-1){
                if(op == '+' ){
                    s.push(num);
                }
                else if(op == '-'){
                    s.push(-num);
                }
                else if(op == '*' ){
                    s.push(s.pop()*num);
                }
                else if(op == '/'  ){
                    s.push(s.pop()/num);
                }
                num=0;
                op=c;
                
            }
        }
        int result = 0;
        for (int n : s) {
            result += n;
        }
        return result;

    }
}