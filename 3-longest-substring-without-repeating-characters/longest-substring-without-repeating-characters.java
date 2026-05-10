class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int ans = 0;
        Map<Character,Integer> hs = new HashMap<>();
        for(int high = 0;high<s.length();high++){
            char ch = s.charAt(high);
            if(hs.containsKey(ch)){
                int val = hs.get(ch);
                hs.put(ch,++val);
            }else{
                hs.put(ch,1);
            }

            while(high-left+1>hs.size()){
                int lv = hs.get(s.charAt(left));
                if(lv==1){
                    hs.remove(s.charAt(left));
                }else{
                    hs.put(s.charAt(left),--lv);
                }
                left++;
            }
            ans = Math.max(ans,high-left+1);
        }
        return ans;
        
        
        
        
        
        
        
        
        // Map<Character,Integer> hs = new HashMap<>();
        // int low = 0;
        // int ans = 0;
        // for(int high= 0;high<s.length();high++){
        //     char ch = s.charAt(high);
        //     if(hs.containsKey(ch)){
        //         int val = hs.get(ch);
        //         hs.put(ch,++val);
        //     }else{
        //         hs.put(ch,1);
        //     }

        //     while(hs.size()<high-low+1){
        //         int value = hs.get(s.charAt(low));
        //         value--;
        //         if(value==0){
        //             hs.remove(s.charAt(low));
        //         } else{
        //             hs.put(s.charAt(low),value);
        //         }
        //         low++;
        //     }

        //     ans = Math.max(ans,high-low+1);
        // }
        // return ans;
    }
}