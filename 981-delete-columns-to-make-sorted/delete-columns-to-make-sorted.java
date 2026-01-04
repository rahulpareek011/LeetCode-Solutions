class Solution {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        for(int i=0;i<strs[0].length();i++){
            ans+=isSorted(strs,i);
        }
        return ans;
    }
    public int isSorted(String[] strs,int i){
        for(int j=strs.length-1;j>0;j--){
            if(strs[j].charAt(i)-'a'<strs[j-1].charAt(i)-'a'){
                return 1;
            }
        }
        return 0;
    }
}