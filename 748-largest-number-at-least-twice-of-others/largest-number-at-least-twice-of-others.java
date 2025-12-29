class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]+nums[i]>nums[n-1]){
                return -1;
            }
        }
        return index;
    }
}