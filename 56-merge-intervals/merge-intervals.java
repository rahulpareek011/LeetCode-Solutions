class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            } else{
                return Integer.compare(a[1],b[1]);
            }
        });
        
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        int currentEnd = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if(currentEnd>=nextStart){
                currentEnd = Math.max(currentEnd,nextEnd);
                ans.get(ans.size()-1)[1] = currentEnd;
            }else{
                ans.add(intervals[i]);
                currentEnd = nextEnd;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}