//https://leetcode.com/problems/integer-to-roman/
class Solution {
    public String intToRoman(int num) {
        if(num<1||num>3999) return "";
        String[] roman={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","V","IV", "I"};
        int[] value={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        StringBuilder res = new StringBuilder();
        int i=0;
        while(num!=0){
            while(num>=value[i]){
                num-=value[i];
                res.append(roman[i]);
            }
            i++;
        }
        return res.toString();
    }
}