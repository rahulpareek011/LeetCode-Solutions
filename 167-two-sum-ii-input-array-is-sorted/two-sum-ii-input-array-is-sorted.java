class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length-1;
        int i = 0;
        while(i<j){
            int n = numbers[i] + numbers[j];
            System.out.println(n);
            if(n==target){
                return new int[]{i+1,j+1};
            } else if(n>target){
                j--;
            } else{
                i++;
            }
        }
        return new int[]{0,0};






        // int[] ans = new int[2];
        // int strt = 0;
        // int end = numbers.length-1;
        // while(strt<end){
        //     int sum = numbers[strt]+numbers[end];
        //     if(sum==target){
        //         ans[0] = strt+1;
        //         ans[1] = end+1;
        //         return ans;
        //     }
        //     else if(sum>target){
        //         end--;
        //     }else{
        //         strt++;
        //     }
        // }
        // return ans;
        
        //brute force
        // for(int i=0;i<numbers.length;i++){
        //     for(int j =i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j] == target) {
        //             ans[0] = i+1;
        //             ans[1] = j+1;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;
    }
}