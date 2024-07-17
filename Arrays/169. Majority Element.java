//https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
                count++;
            }else if(ele==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int i=0;i<nums.length;i++){
            if(ele==nums[i])
                count++;
        }
        if(count>nums.length/2) return ele;
        return -1;
        
    }
}