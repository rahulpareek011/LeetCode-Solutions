class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        Map<Character,Integer> mp = new HashMap<>();
        boolean isDistinct = false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch)){
                int val = mp.get(ch);
                mp.put(ch,++val);
            }else{
                mp.put(ch,1);
            }
        }
        for(int n:mp.values()){
            if(n%2==0){
                count+=n;
            }
            else if((n-1)%2==0){
                count+=n-1;
                isDistinct = true;
            }
        }
        if(isDistinct)
            return count+1;
        else
            return count;
    }
}