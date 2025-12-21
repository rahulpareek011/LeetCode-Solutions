class Solution {
    public int arrangeCoins(int n) {
        long i = 0;
        long j = n;
        int ans = 0;
        while(i<=j){
            long mid = (i+j)/2;
            long coins = mid*(mid+1)/2;
            if(coins<= n){
                ans = (int)mid;
                i = mid+1;
            } else{
                j = mid-1;
            }
        }
        return ans;

        //RIGHT APPROACH
        // int row = 0;
        // for(int i=1;;i++){
        //     n-=i;
        //     if(n<0){
        //         break;
        //     }
        //     row++;
        // }
        // return row;


        // MINE WRONG APPROACH
        // int rowSum = 0;
        // for(int i=1;;i++){
        //     if(i>n) break;
        //     rowSum++;
        //     for(int j=0;j<i;j++){
        //         n--;
        //         if(n==0) break;
        //     }
        // }
        // return rowSum;
    }
}