//https://leetcode.com/problems/generate-parentheses/description/
class Solution {
    public void solve(List<String> res, int n,int open,int close,String s) {
        if(open==close && (open+close)==n*2){
            res.add(s);
            return;
        }

        if(open<n)   solve(res,n,open+1,close,s+"(");
        if(close < open)    solve(res,n,open,close+1,s+")");
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(res,n,0,0,"");
        return res;
    }
}