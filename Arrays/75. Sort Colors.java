//https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        /* Using HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index = 0;
        for(int i=0;i<3;i++){
            int count=0;
            int freq = map.get(i);
            while(count<freq){
                nums[index+count] = i;
                count++;
            }
            index+=freq;
        }
        */
        //Detusche National Flag Algo
        int l = 0, m = 0, h = nums.length - 1;
        while (m <= h) {
            if (nums[m] == 0) {
                swap(nums, l, m);
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else if (nums[m] == 2) {
                swap(nums, m, h);
                h--;
            }
        }
        public void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
}