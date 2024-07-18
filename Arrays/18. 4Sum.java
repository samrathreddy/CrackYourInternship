//https://leetcode.com/problems/4sum/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i!=0 && nums[i]==nums[i-1])  continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])  continue;
                int len = nums.length;
                int k=j+1,l=len-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<l && nums[k]==nums[k-1])   k++;
                        while(k<l && nums[l]==nums[l-1])   l--;
                        k++;
                        l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return res;
    }
}

// TC : O(N^3)
// SC : O(N) No of quadra with sum i.e the result