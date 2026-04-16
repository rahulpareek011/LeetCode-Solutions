class Solution {
    public int majorityElement(int[] nums) {
        int p = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==p){
                count++;
            } else{
                count--;
            }
            if(count==0){
                p = nums[i];
                count = 1;
            }
        }
        return p;


        
        
        
        
        
        
        
        // int candidate = nums[0];
        // int count = 1;

        // for(int i=1;i<nums.length;i++){
        //     if(candidate == nums[i]){
        //         count++;
        //     }else{
        //         count--;
        //     }
        //     if(count==0){
        //         candidate = nums[i];
        //         count = 1;
        //     }
        // }
        // return candidate;
        // Arrays.sort(nums);
        // return nums[nums.length]/2;

        //boyle moore voting algo
        //time complexity = 1
        // int count = 1;
        // int probAns = nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==probAns){
        //         count++;
        //     } else{
        //         count--;
        //     }
        //     if(count == 0){
        //         probAns = nums[i];
        //         count = 1;
        //     }
        // }
        // return probAns;
    }
}