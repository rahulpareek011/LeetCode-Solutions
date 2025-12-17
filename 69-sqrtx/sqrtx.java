class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x/2;
        int target = x;
        int ans = 0;

        while(start<=end){
            long mid = start+(end-start)/2;

            if(mid*mid==target){
                return (int)mid;
            }
            if(mid*mid>target){
                end = (int)mid-1;
            }else{
                ans = (int)mid;
                start = (int)mid+1;
            }
        }
        return ans;
        
        // int i=0;
        // int j=x;
        // int nearest = 0;
        // while(i<=j){
        //     long mid = i+(j-i)/2;

        //     if(mid*mid==x){
        //         return (int)mid;
        //     }
        //     else if(mid*mid<x){
        //         nearest = (int)mid;
        //         i = (int)mid+1;
        //     } else{
        //         j = (int)mid -1;
        //     }
        // }
        // return nearest;
    }
}