class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<nums.length-2;i++){
            while(i>0 && nums[i]==nums[i-1] && i<nums.length-2) i++;
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                
                if(Math.abs(sum-target)<diff){
                    diff = Math.abs(sum-target);
                    ans = sum;
                }
                if(sum==target){
                    return ans;
                }else if(sum>target){
                    k--;
                } else{
                    j++;
                }
            }
        }
        return ans;
        
        
        
        
        // Arrays.sort(nums);
        // int maxdiff = Integer.MAX_VALUE;
        // int ans = 0;
        // for(int i = 0;i<nums.length-2;i++){
        //     int j = i+1;
        //     int k = nums.length-1;
        //     while(j<k){
        //         int sum = nums[i] + nums[j] + nums[k];
        //         if(Math.abs(target - sum) < maxdiff){
        //             maxdiff = Math.abs(target-sum);
        //             ans = sum;
        //         }
        //         if(sum==target){
        //             return ans;
        //         } else if(sum>target){
        //             k--;
        //         } else{
        //             j++;
        //         }
        //     }
        // }
        // return ans;
    }
}