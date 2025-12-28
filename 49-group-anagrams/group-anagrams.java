class Solution {
    // public static boolean isAnagram(String s1,String s2){
    //     int[] freq = new int[26];
        
    //     for(char ch : s1.toCharArray()) freq[ch-'a']++;
    //     for(char ch : s2.toCharArray()) freq[ch-'a']--;

    //     for(int n : freq){
    //         if(n!=0) return false;
    //     }
    //     return true;
    // }

    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> ans = new ArrayList<>();//storing ans here

        // Boolean[] vis = new Boolean[strs.length];
        // //stored false for whole length
        // for(int i=0;i<vis.length;i++){
        //     vis[i] = false;
        // }

        // for(int i=0;i<strs.length;i++){
        //     if(vis[i]!=true){
        //         List<String> curr = new ArrayList<>();
        //         curr.add(strs[i]);
        //         vis[i] = true;

        //         for(int j=i+1;j<strs.length;j++){
        //             if(vis[j]!=true && isAnagram(strs[i],strs[j])){
        //                 curr.add(strs[j]);
        //                 vis[j] = true;
        //             }
        //         }

        //         ans.add(curr);
        //     }
        // }
        // return ans;

        HashMap<String,List<String>> hsmp = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i= 0;i<strs.length;i++){
            String word = strs[i];
            char[] check = word.toCharArray();
            Arrays.sort(check);
            String sorted = new String(check);
            if(hsmp.containsKey(sorted)){
                List<String> ls = hsmp.get(sorted);
                ls.add(word);
                hsmp.put(sorted,ls);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(word);
                hsmp.put(sorted,ls);
            }
        }
       
        for(List<String> n: hsmp.values()){
            ans.add(n);
        }
        return ans;
    }
}