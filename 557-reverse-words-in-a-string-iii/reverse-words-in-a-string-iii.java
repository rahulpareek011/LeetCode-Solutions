class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        System.out.print(Arrays.toString(str));
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<str.length;i++){
            StringBuilder word = new StringBuilder(str[i]);
            ans.append(word.reverse());
            if(i+1!=str.length) ans.append(" ");
        }
        return ans.toString();
    }
}