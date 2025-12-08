1class Solution {
2    public int strStr(String haystack, String needle) {
3        if (needle.length() == 0) return 0;
4        int j = 0;
5
6        for (int i = 0; i < haystack.length(); i++) {
7            if (haystack.charAt(i) == needle.charAt(j)) {
8                j++;
9                if (j == needle.length()) return i - j + 1;
10            } else {
11                i = i - j;   // go back to the next starting point
12                j = 0;
13            }
14        }
15
16        return -1;
17
18        // int j = 0;
19        // for(int i=0;i<haystack.length();i++){
20        //     if(haystack.charAt(i)==needle.charAt(j)){
21        //         j++;
22        //         if(j==needle.length()) return i-j+1;
23        //     }else{
24        //         j=0;
25        //     }
26        // }
27        // return -1;
28
29
30    }
31}