//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class Solution {
    public int maxProfit(int[] prices) {
        /* Using stack better if we draw graph to understannd
        Stack<Integer> s=new Stack<>();
        int i=prices.length-1,maxprof=0;
         while(i>=0){
             if(s.empty() || s.peek()<prices[i]) {
                 s.push(prices[i]);
                 }
             else{
                     maxprof+=s.peek()-prices[i];
                     s.push(prices[i]);
             }
             i--;
         }
		return maxprof;
        */

        //Greedy Approach since there is a uniform pattern
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}