class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
        for(int i =0;i<bookings.length;i++){
            int start = bookings[i][0];
            int end = bookings[i][1];
            int elem = bookings[i][2];
            start--;
            ans[start]+=elem;
            if(end<n){
                ans[end]-=elem;
            }
            // while(start<=end){
            //     ans[start-1] = ans[start-1]+elem;
            //     start++;
            // }
        }
        for(int i = 1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}