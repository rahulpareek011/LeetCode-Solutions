class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merge[k++] = nums1[i];
                i++;
            }else{
                merge[k++] = nums2[j];
                j++;
            }
        }
       while(i<m){
        merge[k++] = nums1[i];
        i++;
       }

       while(j<n){
        merge[k++] = nums2[j];
        j++;
       }

       for(int b = 0;b<nums1.length;b++){
        nums1[b] = merge[b];
       }
        
        // int k=(n+m)-1;
        // for(int i=nums2.length-1;i>0;i--){
        //     if(nums1[n-1]<nums2[m-1]){
        //         nums1[k--] = nums2[m-1];
        //         m--;
        //     }else{
        //         nums2[k--] = nums1[n-1];
        //         n--;
        //     }
        // }


        // int min = 0;
        // int end = n+m;
        // for(int i=m;i<end;i++){
        //     if(nums1[i]==0){
        //         nums1[i]= nums2[nums2.length-n--];
        //     }
        // }
        // Arrays.sort(nums1);
    }
}