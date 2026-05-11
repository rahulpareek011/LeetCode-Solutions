class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int ans = 0;
        int oc = 0;

        for(int high = 0;high<nums.length;high++){
            if(nums[high]==1){
                oc++;
            }
    
            while((high-low+1)-oc>k){
                if(nums[low]==1){
                    oc--;
                }
                low++;
            }

            if((high-low+1)-oc<=k){
                ans = Math.max((high-low+1),ans);
            }
        }
        return ans;
    }
}