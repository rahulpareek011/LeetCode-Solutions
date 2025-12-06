class Solution {
    public int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        Arrays.sort(nums);
        int uniqueCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                uniqueCount++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            }
            else if(nums[i]<firstMax && nums[i]>secondMax){
                thirdMax = secondMax;
                secondMax = nums[i];
            }
            else if(nums[i]<secondMax && nums[i]>thirdMax){
                thirdMax = nums[i];
            }
        }
        if(uniqueCount<3) return firstMax;
        return thirdMax;
    }
}