//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
//Key idea: You can’t choose 2nd element from the beginning unless you have chosen the first one. Similarly, you can’t choose 2nd element from last unless you have chosen the last one.
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int max=lsum,ridx=cardPoints.length-1,rsum=0;
        for(int i=k-1;i>=0;i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[ridx--];
            max = Math.max(max,lsum+rsum);
        }
        return max;
    }
}