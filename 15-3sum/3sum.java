class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            while(i > 0 && nums[i] == nums[i -1] && i < nums.length - 2) i++;
            int target = -1 * nums[i];
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[j] + nums[k];
                if(sum==target){
                    List<Integer> ls = Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(ls);
                    j++;
                    k--;
                    while(j<nums.length && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(k>=0 && nums[k]==nums[k+1]){
                        k--;
                    }
                } else if(sum<target){
                    j++;
                } else{
                    k--;
                }
            }
        }
        return res;




        // Set<List<Integer>> ans = new HashSet<>();
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     Set<Integer> hs = new HashSet<>();
        //     for(int j=i+1;j<n;j++){
        //         int third = -(nums[i]+nums[j]);
        //         if(hs.contains(third)){
        //             List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
        //             Collections.sort(temp);
        //             ans.add(temp);
        //         }
        //         hs.add(nums[j]);
        //     }
        // }
        // return new ArrayList<>(ans);



        // List<List<Integer>> ans = new ArrayList<>();
        // Set<List<Integer>> st = new HashSet<>();
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 System.out.println(nums[i]+" "+nums[j]+" "+" "+nums[k]);
        //                 List<Integer> ls = new ArrayList<>();
        //                 ls.add(nums[i]);
        //                 ls.add(nums[j]);
        //                 ls.add(nums[k]);
        //                 ls.sort(Comparator.naturalOrder());
        //                 st.add(ls);
        //             }
        //         }
        //     }
        // }
        // System.out.println(st);
        // for(List<Integer> an : st){
        //     ans.add(an);
        // }
        // return ans;
    }
}