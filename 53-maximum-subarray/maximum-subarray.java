class Solution {
    public int maxSubArray(int[] nums) {
        // int sum = 0;
        // int maxi = Integer.MIN_VALUE;

        // for(int i=0;i<nums.length;i++){
        //     sum = sum+nums[i];

        //     if(sum>maxi){
        //         maxi = sum;
        //     }
        //     if(sum<0){
        //         sum = 0;
        //     }
        // }
        // return maxi;


        //kadanes version
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;

        //with prefix
        // int sum = 0;
        // int minPrefix = 0;
        // int maxSum = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {
        //     sum += nums[i];                 // prefixSum[i]
        //     maxSum = Math.max(maxSum, sum - minPrefix);
        //     minPrefix = Math.min(minPrefix, sum);
        // }
        // return maxSum;


        //with prefix
        // int sum = 0;
        // int prefixSum[] = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){
        //     sum += nums[i];
        //     prefixSum[i] = sum;
        // }
        // int count = 0;
        // int minPrefix = 0;
        // int maxSum = Integer.MIN_VALUE;

        // for(int i = 0; i < nums.length; i++){
        //     maxSum = Math.max(maxSum, prefixSum[i] - minPrefix);
        //     minPrefix = Math.min(minPrefix, prefixSum[i]);
        // }
        // return count;
    }
}