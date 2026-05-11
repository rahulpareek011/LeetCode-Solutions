class Solution {
    public int maxF(int[] arr){
        int ans = 0;
        for(int n:arr){
            ans = Math.max(ans,n);
        }
        return ans;
    }
    
    public int characterReplacement(String s, int k) {
        int low = 0;
        int maxf = 0;
        int ans = 0;
        int arr[] = new int[256];

        for(int high = 0;high<s.length();high++){
            arr[s.charAt(high)]++;

            maxf = maxF(arr);
            while((high-low+1)-maxf>k){
                arr[s.charAt(low)]--;
                low++;
                maxf = maxF(arr);
            }
            ans = Math.max(high-low+1,ans);
        }
        return ans;





    //     int low = 0;
    //     int maxF = 0;
    //     int n = s.length();
    //     int[] arr = new int[256];
    //     int ans = 0;

    //     for(int high=0;high<n;high++){
    //         arr[s.charAt(high)]++;

    //         maxF = maxFreq(arr);

    //         while((high-low+1)-maxF>k){
    //             arr[s.charAt(low)]--;
    //             low++;
    //             maxF = maxFreq(arr);
    //         }
    //         ans = Math.max(high-low+1,ans);
    //     }
    //     return ans;
    }
}