class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;

        // skip trailing spaces
        while (s.charAt(i) == ' ') {
            i--;
        }

        // count last word length
        while (i>=0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;


        // int sum =0;
        // int lastSum = 0;
        // for(int i=1;i<=s.length();i++){
        //     sum++;
        //     if(s.charAt(i-1)==' '){
        //         if(lastSum<=1) lastSum = sum;
        //         sum = 0;
        //     }
        // }
        // if(s.charAt(s.length()-1)==' ') return lastSum;
        // return sum;
    }
}