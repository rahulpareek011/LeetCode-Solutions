class Solution {
    public void sortColors(int[] nums) {
        /*
         “I maintain three pointers: one for 0s, one for 2s,
          and one current pointer. Based on the current value,
          I swap and shrink boundaries while maintaining the invariant.”

        🧠 Mental sentence to remember forever
        “I don’t sort elements — I only move boundaries until nothing is unknown.”
        */
        int i= 0;
        int j = 0;
        int k = nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
            else if(nums[j]==2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }else{
                j++;
            }
        }

        // int num1 = 0;
        // int num2 = 0;
        // int num3 = 0;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         num1++;
        //     }
        //     if(nums[i]==1){
        //         num2++;
        //     }
        //     if(nums[i]==2){
        //         num3++;
        //     }
        // }
        // int k = 0;
        // for(int i=0;i<num1;i++){
        //     nums[k] = 0;
        //     k++;
        // }
        // for(int i=0;i<num2;i++){
        //     nums[k] = 1;
        //     k++;
        // }
        // for(int i=0;i<num3;i++){
        //     nums[k] = 2;
        //     k++;
        // }

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             num[j] = nums[i]+num[j];
        //             int temp = nums[j];
        //             nums[j] = nums[i];
        //             nums[i] = temp;
        //         }
        //     }
        // }
        //System.out.println(Arrays.toString(nums));
    }
}