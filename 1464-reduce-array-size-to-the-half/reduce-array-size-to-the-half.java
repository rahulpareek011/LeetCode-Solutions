class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(hs.containsKey(arr[i])){
                int index =hs.get(arr[i]);
                hs.put(arr[i],++index);
            }else{
                hs.put(arr[i],1);
            }
        }
        int k = 0;
        for(int i:hs.values()){
            ans[k++] = i;
        }
        Arrays.sort(ans);
        int sum  = 0;
        int count = 0;
        for(int i=ans.length-1;i>=0;i--){
            count++;
            sum+=ans[i];
            if(sum>=n/2){
                return count;
            }
        }
        return -1;
    }
}