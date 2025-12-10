class Solution {
    public boolean isAnagram(String s, String t) {
        // char charArr1[] = s.toCharArray();
        // char charArr2[] = t.toCharArray();
        // if(charArr1.length!=charArr2.length) return false;

        // Arrays.sort(charArr1);
        // Arrays.sort(charArr2);
        // for(int i=0;i<charArr1.length;i++){
        //     if(charArr1[i]!=charArr2[i]){
        //         return false;
        //     }
        // }
        // return true;

        if(s.length()!=t.length()) return false;
        int[] freq = new int[26];
        System.out.println(Arrays.toString(freq));

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }

        return true;
    }
}