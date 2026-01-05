class Solution {
    public long minCost(String s, int[] cost) {
        int n = s.length();
        long mini = Long.MAX_VALUE;
        for(char c='a';c<='z';c++){
            long sum = 0;
            int cnt=0;
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(ch!=c){
                    sum+=cost[i];
                    cnt++;
                }
            }
            if(cnt!=n)
                mini = Math.min(mini,sum);
        }
        return mini;
    }
}