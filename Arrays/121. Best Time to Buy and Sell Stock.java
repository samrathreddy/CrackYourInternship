//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        /* Brute Approach
        int max = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]) max=Math.max(max,prices[j]-prices[i]);
            }
        }
        return max;
        TC : O(N^2)
        SC : O(1)
        */

        //Optimal Approach
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int price : prices){
            min = Math.min(min, price);
            max = Math.max(max, price-min);
        }
        return max;
        //TC : O(N)
        //SC : O(1)
    }
}