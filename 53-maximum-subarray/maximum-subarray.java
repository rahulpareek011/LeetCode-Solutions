class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];

            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxi;


        // int sum = 0;
        // int prefixSum[] = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){
        //     sum += nums[i];
        //     prefixSum[i] = sum;
        // }
        
        // int minPrefix = 0;
        // int maxSum = Integer.MIN_VALUE;

        // for(int i = 0; i < nums.length; i++){
        //     maxSum = Math.max(maxSum, prefixSum[i] - minPrefix);
        //     minPrefix = Math.min(minPrefix, prefixSum[i]);
        // }
        // return maxSum;
    }
}