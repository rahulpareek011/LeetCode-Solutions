class Solution {
    public int sumFourDivisors(int[] nums) {
        // int totSum = 0;
        // for(int i=0;i<nums.length;i++){
        //     int count = 2;
        //     int sum = nums[i]+1;
        //     for(int j=2;j<=nums[i]/2;j++){
        //         if(nums[i]%j==0){
        //             count++;
        //             sum+=j;
        //         }
        //     }
        //     if(count==4){
        //         totSum+=sum;
        //     }
        // }
        // return totSum;
        int totSum = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            int sum = 0;
            for(int j=1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    sum+=j;
                    sum+=(nums[i]/j);
                    count+=2;
                    if((j*j)==nums[i]){
                        sum-=j;
                        count--;
                    }
                }
            }
            if(count==4){
                totSum+=sum;
            }
        }
        return totSum;
    }
}