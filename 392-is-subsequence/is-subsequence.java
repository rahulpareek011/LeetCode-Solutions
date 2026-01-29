class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int j = 0;
        int n = s.length();
        for(int i = 0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            if(j>n-1) return true;
        }
        return false;
    }
}