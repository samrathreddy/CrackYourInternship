//https://leetcode.com/problems/coin-change/
class Solution {
    int solver(int[] coins, int n, int amount,int[][] dp){
        if(n==0){
            if(amount%coins[0] == 0)    return amount/coins[0];
            else return Integer.MAX_VALUE;
        }
        if(dp[n][amount]!=-1)    return dp[n][amount];
        int notTake=0+solver(coins,n-1,amount,dp);
        int take = Integer.MAX_VALUE;
        if(amount>=coins[n]){
            int subResult = solver(coins, n, amount - coins[n], dp);
            if (subResult != Integer.MAX_VALUE) {
                take = 1 + subResult;
            }
        }
        return dp[n][amount]=Math.min(notTake, take);
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp =new int[coins.length][amount+1];
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }
        int res = solver(coins,coins.length-1,amount,dp);
         if (res == Integer.MAX_VALUE) {
            return -1;
        }
        return res;
    }
}