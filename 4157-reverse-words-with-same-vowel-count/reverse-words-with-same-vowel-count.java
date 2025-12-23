class Solution {
    public String reverse(String s){
        String reversedStr = "";

        // Iterate from the last character to the first
        for (int i = s.length() - 1; i >= 0; i--) {
            // Append each character to the new string
            reversedStr += s.charAt(i);
        }
        return reversedStr;
    }

    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));
        int prevCount = 0;
        for(int i=0;i<s1[0].length();i++){
            if(s1[0].charAt(i)=='a'||s1[0].charAt(i)=='e'||s1[0].charAt(i)=='i'||s1[0].charAt(i)=='o'||s1[0].charAt(i)=='u'){
                prevCount++;
            }
        }

        for(int i=1;i<s1.length;i++){
            int currCount = 0;
            for(int j=0;j<s1[i].length();j++){
                if(s1[i].charAt(j)=='a'||s1[i].charAt(j)=='e'||s1[i].charAt(j)=='i'||s1[i].charAt(j)=='o'||s1[i].charAt(j)=='u'){
                    currCount++;
                }
            } 
            if(currCount>0 && prevCount==currCount){
                s1[i] = reverse(s1[i]);
            }
            if(currCount==0 && prevCount==0){
                s1[i] = reverse(s1[i]);
            }
        }
        String delimiter = " ";
        String result = String.join(delimiter, s1);
        return result;
    }
}