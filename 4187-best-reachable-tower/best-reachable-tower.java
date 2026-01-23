class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        Arrays.sort(towers,(a,b)->{
            if(a[0]!=b[0])
                return a[0]-b[0];
            return a[1]-b[1];
        });
        int n = towers.length;
        int ans[] = {-1,-1};
        int prev = -1;
        for(int i = 0;i<n;i++){
            int dist = Math.abs(towers[i][0]-center[0]) + Math.abs(towers[i][1]-center[1]);
            if(dist<=radius && towers[i][2]>prev){
                prev = towers[i][2];
                ans[0] = towers[i][0];
                ans[1] = towers[i][1];
            }
        }
        return ans;
    }
}