class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i];
        }
        int suf = nums[nums.length-1];
        int ans[] = new int[nums.length];
        ans[nums.length-1] = prefix[nums.length-2];
        for(int i=nums.length-2;i>0;i--){
            ans[i] = prefix[i-1]*suf;
            suf = suf*nums[i];
        }
        ans[0] = suf;
        // ans[nums.length-1] = prefix[nums.length-2];
        // for(int i =1;i<nums.length-1;i++){
        //     ans[i] = prefix[i-1]*suffix[i+1];
        // }
        return ans;
        
        // int n = nums.length;
        // int pre[] = new int[n];
        // pre[0] = nums[0];
        // for(int i=1;i<n;i++){
        //     pre[i] = pre[i-1] * nums[i];
        // }
        // int res[] = new int[n];
        // res[n-1] = pre[n-2];
        // int prod = nums[n-1];//suffix
        // for(int i=n-2;i>=0;i--){
        //     if(i>0){
        //         res[i] = pre[i-1]*prod;//multiplying prefix and suffix
        //     } else{
        //         res[i] = prod;
        //     }
        //     prod = prod * nums[i]; //increasing suffix
        // }
        // return res;
        

        // //Finding Prefix Product and Suffix Product
        // int n = nums.length;
        // int pre[] = new int[n];
        // int suff[] = new int[n];
        // pre[0] = 1;
        // suff[n - 1] = 1;
        
        // for(int i = 1; i < n; i++) {
        //     pre[i] = pre[i - 1] * nums[i - 1];
        // }
        // for(int i = n - 2; i >= 0; i--) {
        //     suff[i] = suff[i + 1] * nums[i + 1];
        // }
        
        // int ans[] = new int[n];
        // for(int i = 0; i < n; i++) {
        //     ans[i] = pre[i] * suff[i];
        // }
        // return ans;

        //brute force
        // int ans[] = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int sum = 1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             sum = sum*nums[j];
        //         }
        //     }
        //     ans[i] = sum;
        // }
        // return ans;
    }
}