//https://leetcode.com/problems/two-sum/description/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* Just the number needed variant 
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == target)   return new int[]{nums[i],nums[j]};
            if(sum<target)  i++;
            else j--;
        }
        return new int[]{0,0};
        */
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}