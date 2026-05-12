class Solution {
    // public Boolean chkStr(String s,String t){
    //     int arr[] = new int[256];

    //     for(char c:s.toCharArray()){
    //         arr[c]++;
    //     }
    //     for(char c:t.toCharArray()){
    //         arr[c]--;
    //     }

    //     for (char c:t.toCharArray()) {
    //         if(arr[c]<0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public boolean chks(HashMap<Character,Integer> hs,String t){
    //     for(char ch:t.toCharArray()){
    //         if(!hs.containsKey(ch)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public boolean chks(int[] tFreq, int[] winFreq,String t){
    //     for (char c:t.toCharArray()) {
    //         if(tFreq[c]>winFreq[c]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public String minWindow(String s, String t) {
        int low = 0;
        String ans = "";
        String word = "";
        int minLen = Integer.MAX_VALUE;
        //HashMap<Character,Integer> hs = new HashMap<>();
        int freqT[] = new int[256];
        int requiredT = 0;
        for(char c:t.toCharArray()){
            freqT[c]++;
            if(freqT[c]==1) requiredT++;
        }
        int windowFreq[] = new int[256];
        int formed = 0;

        for(int high = 0;high<s.length();high++){
            char ch = s.charAt(high);
            windowFreq[ch]++;
            if(windowFreq[ch] == freqT[ch]){
                formed++;
            }
            // if(hs.containsKey(s.charAt(high))){
            //     int vl = hs.get(s.charAt(high));
            //     hs.put(s.charAt(high),++vl);
            // } else{
            //     hs.put(s.charAt(high),1);
            // }

            while(formed==requiredT){
                if(high-low+1<minLen){
                    minLen = high-low+1;
                    ans = s.substring(low, high+1);
                }
                if(windowFreq[s.charAt(low)] == freqT[s.charAt(low)]){
                    formed--;
                }
                windowFreq[s.charAt(low)]--;
                // int vl = hs.get(s.charAt(low));
                // if(vl==1){
                //     hs.remove(s.charAt(low));
                // }else{
                //     hs.put(s.charAt(low),--vl);
                // }
                low++;
            }
        }
        return ans;
    }
}