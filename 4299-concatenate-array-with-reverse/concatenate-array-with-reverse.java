class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[] = new int[nums.length*2];
        int i = 0;
        int j = ans.length-1;
        while(i<j){
            ans[i] = nums[i];
            ans[j] = nums[i];
            i++;
            j--;
        }
        return ans;
    }
}