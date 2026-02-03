class Solution {
    public int maxProfit(int[] prices) { 
        int n = prices.length;
        int mb = Integer.MAX_VALUE;//want to buy minimum
        int prof = 0;//overall profit
        int pist = 0;//profit if sold today

        for(int i=0;i<prices.length;i++){
            if(prices[i]<mb){
                mb = prices[i];
            }
            pist = prices[i]-mb;//calculating profit if sold today
            if(prof<pist){
                prof = pist;//update overall profit
            }
        }
        return prof;
        // for(int i=n-1;i>0;i--){
        //     maxP = Math.max(prices[i],maxP);
        // }
        // int ans = 0;
        // for(int i=0;i<n;i++){
        //     ans = Math.max(maxP-prices[i],ans);
        // }
        // return ans;
    }
}