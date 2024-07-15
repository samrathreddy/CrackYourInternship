//https://leetcode.com/problems/find-the-duplicate-number/
class Solution {
    public int findDuplicate(int[] nums) {
        /* Using set Better approach
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!s.add(nums[i])) return nums[i];
        }
        return nums.length; */


        //Tortoise & Harre Method(Optimal)
        int s=0,f=0;
        do{
            s=nums[s];
            f=nums[nums[f]];
        }while(s!=f);
        s = 0;
        while(s!=f){
            s=nums[s];
            f=nums[f];
        }
        return f;
        //TC : O(N)
        //SC : O(1)
    }
}