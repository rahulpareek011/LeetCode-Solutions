1class Solution {
2    public boolean isPalindrome(String s) {
3        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
4        int j = 0;
5        for(int i=s1.length()-1;i>=j;i--){
6            if(s1.charAt(i)!=s1.charAt(j)){
7                return false;
8            }
9            j++;
10        }
11        return true;
12    }
13}