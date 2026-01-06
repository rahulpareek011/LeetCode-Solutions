class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        if(g.length==0 || s.length==0) return count;
        int j = 0;
        for(int i=0;i<g.length;){
            if(g[i]<=s[j]){
                count++;
                i++;
            }
            j++;
            if(j==s.length) break;
        }
        return count;
    }
}