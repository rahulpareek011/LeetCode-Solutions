class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Store unique triplets
        Set<List<Integer>> ans = new HashSet<>();
        int n= nums.length;
        // First loop for first element
        for (int i = 0; i < n; i++) {
            // Set to store elements seen in this iteration
            Set<Integer> hashset = new HashSet<>();

            // Second loop for second element
            for (int j = i + 1; j < n; j++) {
                // Calculate third element needed
                int third = -(nums[i] + nums[j]);

                // If third already in set, we found a triplet
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }

                // Add current element to set
                hashset.add(nums[j]);
            }
        }

        // Convert set to list
        return new ArrayList<>(ans);



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