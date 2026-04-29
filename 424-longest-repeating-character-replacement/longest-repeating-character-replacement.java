class Solution {
    public int maxFreq(int[] arr){
        int ans = 0;
        for(int n:arr){
            ans = Math.max(n,ans);
        }
        return ans;
    }
    public int characterReplacement(String s, int k) {
        int low = 0;
        int maxF = 0;
        int n = s.length();
        int[] arr = new int[256];
        int ans = 0;

        for(int high=0;high<n;high++){
            arr[s.charAt(high)]++;
            System.out.println(arr[s.charAt(high)]);

            maxF = maxFreq(arr);
            System.out.println(maxF);

            while((high-low+1)-maxF>k){
                arr[s.charAt(low)]--;
                low++;
                maxF = maxFreq(arr);
            }
            ans = Math.max(high-low+1,ans);
        }
        return ans;
    }
}