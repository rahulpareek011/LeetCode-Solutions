class Solution {
    public boolean isAnagram(String s, String t) {
        char charArr1[] = s.toCharArray();
        char charArr2[] = t.toCharArray();
        if(charArr1.length!=charArr2.length) return false;

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        for(int i=0;i<charArr1.length;i++){
            if(charArr1[i]!=charArr2[i]){
                return false;
            }
        }
        return true;
    }
}