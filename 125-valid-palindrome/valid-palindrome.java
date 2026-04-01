class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int j = s1.length()-1;
        int i = 0;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;





        // String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();//using regex
        // /* Explanation (say this):
        //     “I use a regular expression where [^a-zA-Z0-9] matches any 
        //     character that is not alphanumeric and replace it with an empty string.”
        // */
        // int j = 0;
        // for(int i=s1.length()-1;i>=j;i--){
        //     if(s1.charAt(i)!=s1.charAt(j)){
        //         return false;
        //     }
        //     j++;
        // }
        // return true;
    }
}