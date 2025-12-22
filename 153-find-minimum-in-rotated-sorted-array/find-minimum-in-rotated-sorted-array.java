class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int i= 0;
        int j= n-1;
        while(i<j){
            int mid = (i+j)/2;

            if(nums[mid]<nums[j]){
                j = mid;
            }
            if(nums[mid]>nums[n-1]){
                i = mid+1;
            }
        }
        return nums[i];
    }
}