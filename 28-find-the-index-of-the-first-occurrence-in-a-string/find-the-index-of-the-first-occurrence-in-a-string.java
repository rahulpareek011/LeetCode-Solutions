class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        int j = 0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
                if(j==needle.length()) return i-j+1;
            } else{
                i=i-j;
                j = 0;
            }
        }
        return -1;


        // if (needle.length() == 0) return 0;
        // int j = 0;

        // for (int i = 0; i < haystack.length(); i++) {
        //     if (haystack.charAt(i) == needle.charAt(j)) {
        //         j++;
        //         if (j == needle.length()) return i - j + 1;
        //     } else {
        //         i = i - j;   // go back to the next starting point
        //         j = 0;
        //     }
        // }

        //return -1;

        // int j = 0;
        // for(int i=0;i<haystack.length();i++){
        //     if(haystack.charAt(i)==needle.charAt(j)){
        //         j++;
        //         if(j==needle.length()) return i-j+1;
        //     }else{
        //         j=0;
        //     }
        // }
        // return -1;


    }
}