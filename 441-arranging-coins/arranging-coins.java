class Solution {
    public int arrangeCoins(int n) {

        int row = 0;
        for(int i=1;;i++){
            n-=i;
            if(n<0){
                break;
            }
            row++;
        }
        return row;


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