class Solution {
    public int[] reverse(int[] arr,int i,int j){
        for(i=i;i<j;i++){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }
        return arr;
    }

    public void rotate(int[] nums, int k) {
        if(nums.length<k) k = k%nums.length;
        nums = reverse(nums,0,nums.length-1);
        nums = reverse(nums,k,nums.length-1);
        nums = reverse(nums,0,k-1);
    }
}