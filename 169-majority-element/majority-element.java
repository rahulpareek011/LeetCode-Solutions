class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int probAns = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==probAns){
                count++;
            } else{
                count--;
            }
            if(count == 0){
                probAns = nums[i];
                count = 1;
            }
        }
        return probAns;
    }
}