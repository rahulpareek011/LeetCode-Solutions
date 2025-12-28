class Solution {
    // private boolean check(int[] nums, int len, int t) {
    //     int sum = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         sum += nums[i];

    //         if (i >= len)
    //             sum -= nums[i - len];

    //         if (i >= len - 1 && sum >= t)
    //             return true;
    //     }
    //     return false;
    // }

    public int minSubArrayLen(int target, int[] nums) {
        //     int n=nums.length;
        //     int s=1;
        //     int e=n;
        //     int ans=n+1;
        //     while(s<=e)
        //     {
        //         int mid=s+(e-s)/2;
        //         if(check(nums,mid,target))
        //         {
        //             ans=mid;
        //             e=mid-1;
        //         }
        //         else
        //             s=mid+1;
        //     }
        //     if(ans==n+1)
        //         return 0;
        //     return ans;


        //sliding window ( O(n) + O(1) )
        int left = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;
        for(int right=0;right<nums.length;right++){
            sum+= nums[right];

            while(sum>=target){
                len = Math.min(len,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(len>0 && len!=Integer.MAX_VALUE) return len;
        return 0;
        /*
        “Since all elements are positive, I can use a sliding window.
        I expand the window by moving the right pointer and adding to the sum.
        When the sum becomes greater than or equal to the target, I try to shrink 
        the window from the   left to minimize the length while keeping the sum valid.
        Each element is added and removed at most once, so the time complexity is O(n).”

        When negatives are allowed, we switch patterns:
        ✅ Prefix Sum + HashMap

        Example:
        LeetCode 560 (Subarray Sum Equals K)
        */
    }
}