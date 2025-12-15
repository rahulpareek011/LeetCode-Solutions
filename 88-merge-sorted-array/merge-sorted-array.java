class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int min = 0;
        int end = n+m;
        for(int i=m;i<end;i++){
            if(nums1[i]==0){
                nums1[i]= nums2[nums2.length-n--];
            }
        }
        Arrays.sort(nums1);
    }
}