class Solution {
    public static boolean check(int[] p,int m, int h){
        int sum = 0;
        for(int i=0;i<p.length;i++){
            sum+= (p[i]+m-1)/m;
            if(sum>h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        int ans = 0;
        for(int n:piles){
            end = Math.max(n,end);
        }
        while(start<=end){
            int mid = (start+end)/2;

            if(check(piles,mid,h)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}