class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n = target - nums[i];

            if(mp.containsKey(n)){
                int val = mp.get(n);
                return new int[]{val,i};
            }else{
                mp.put(nums[i],i);
            }
        }
        return new int[]{};


        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
    }
}