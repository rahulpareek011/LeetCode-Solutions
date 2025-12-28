class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hsmp = new HashMap<>();
        HashMap<Character,Character> hsmp1 = new HashMap<>();

        for(int i = 0; i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(hsmp.containsKey(ch1)){
                char tmp = hsmp.get(ch1);
                if(tmp!=ch2) return false;
            } else{
                hsmp.put(ch1,ch2);
            }

            if(hsmp1.containsKey(ch2)){
                char temp = hsmp1.get(ch2);
                if(temp!=ch1) return false;
            }else{
                hsmp1.put(ch2,ch1);
            }
        }
        return true;
        // for(int i=0;i<s.length();i++){
        //     char ch1 = s.charAt(i);
        //     char ch2 = t.charAt(i);
            
        //     if(hsmp.containsKey(ch1)){
        //         char ch = hsmp.get(ch1);
        //         if(ch!=ch2) return false;
        //     } 
        //     else if(hsmp.containsValue(ch2)){
        //         return false;
        //     }
        //     hsmp.put(ch1,ch2);
        // }
        // return true;
     }
}