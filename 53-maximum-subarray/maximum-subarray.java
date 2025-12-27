class Solution {
    public int maxSubArray(int[] nums) {
         /*
      Approach	                Key Idea
      =>Declarative Kadane	    max(nums[i], currentSum + nums[i])
      =>Procedural Kadane	    Reset sum to 0 when negative
      =>Prefix-Min	            prefixSum[i] - minPrefix
      =>Brute Force	            Try all subarrays
    */

        // 1. Kadane (Declarative form) — O(n) time, O(1) space
        //“A negative running sum can never help form a maximum subarray, so Kadane’s algorithm drops it immediately.”
        /*
        Explanation:
        At every index, we decide:
        - Either start a new subarray from nums[i]
        - Or extend the previous subarray

        If the previous sum is negative, it is discarded because
        a negative sum can never help in forming a maximum subarray.
        */

        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // “At each index, I make a greedy decision:
            // either start a new subarray from the current element,
            // or extend the previous subarray.”

            // “If the previous sum is negative, extending it would 
            // reduce the result, so  I discard it and start fresh 
            // from the current element. If it’s positive, I extend it.”
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
        //“I update the global maximum at every step, and return it at the end.”



        // 2. Classic Kadane (procedural form). O(n): “I keep adding elements to a running sum and track the maximum; the moment the sum becomes negative, I reset it because a negative prefix cannot contribute to a maximum subarray.”
        /*
        Explaination:
        for classical kadane my approach is simple

        for negative value i will add it and check if it is max, in case our max is negative value 
        and after it i don't carry negative sum means:
        if my sum is negative i will reset it
        */
        // int maxSum = Integer.MIN_VALUE;
        // int sum = 0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i]; 
        //     if(sum>maxSum){
        //         maxSum = sum;
        //     }
        //     if(sum<0){
        //         sum = 0;
        //     }
        // }
        // return maxSum;



        //3. Prefix-Min / Prefix Sum approach — O(n): “Any subarray sum can be written as the difference of two prefix sums, so to maximize the subarray ending at each index, I subtract the smallest prefix sum seen so far.”
        /*
        Explanation:
        Brute force checks all subarrays which takes O(n^2).
        To optimize this, we use prefix sums.

        Any subarray sum from index l to r can be written as:
        prefixSum[r] - prefixSum[l - 1]

        So, for each index i, if we want the maximum subarray ending at i,
        we should subtract the minimum prefix sum that appeared before i.

        While iterating:
        - 'sum' represents the current prefix sum
        - 'minPrefix' stores the smallest prefix sum seen so far
        - 'sum - minPrefix' gives the maximum subarray sum ending at index i

        We update the global maximum accordingly.
        */

        // int sum = 0;
        // int maxSum = Integer.MIN_VALUE; // handles all-negative arrays
        // int minPrefix = 0; // empty prefix before index 0

        // for (int i = 0; i < nums.length; i++) {
        //     sum += nums[i];
        //     maxSum = Math.max(maxSum, sum - minPrefix);
        //     minPrefix = Math.min(minPrefix, sum);
        // }
        // return maxSum;



        // // 4. Brute Force (all subarrays) — O(n^2)
        // int maxSum = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum = 0; //for every ith element i want new sum to check
        //     for(int j=i;j<nums.length;j++){
        //         sum = sum + nums[j];
        //         maxSum = Integer.max(maxSum,sum);//for every next element sum, it will check is it greater from the previous one or not
        //     }
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