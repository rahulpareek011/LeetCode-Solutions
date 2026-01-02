class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                return Math.abs(nums[i]);
            }
            nums[index] = -nums[index];
        }
        return -1;
        //Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         return nums[i];
        //     }
        // }
        // return -1;
    }
}