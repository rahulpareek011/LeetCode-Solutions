class Solution {
    public int mySqrt(int x) {
        int i=0;
        int j=x;
        int nearest = 0;
        while(i<=j){
            long mid = i+(j-i)/2;

            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid<x){
                nearest = (int)mid;
                i = (int)mid+1;
            } else{
                j = (int)mid -1;
            }
        }
        return nearest;
    }
}