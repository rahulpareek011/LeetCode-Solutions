class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        HashSet<Integer> hst = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(hs.containsKey(nums1[i])){
                continue;
            } else{
                hs.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(hs.containsKey(nums2[i])){
                hst.add(nums2[i]);
            }
        }
        int ans[] = new int[hst.size()];
        int i = 0;
        for(int val:hst){
            ans[i++] = val;
        }
        return ans;
    }
}