//https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
    /*With swapping 
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                if(i!=j){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
                j++;
            }
        }
    */
        if(nums.length == 1)    return;
        int idx = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[idx++] = nums[i];
        }
        while(idx<nums.length){
            nums[idx++] = 0;
        }   
    }
    //TC : O(N)
    //SC : O(1)
}