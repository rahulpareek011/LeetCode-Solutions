class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                return true;
            }else{
                mp.put(nums[i],i);
            }
        }
        return false;

        // Arrays.sort(nums);
        // for(int i=nums.length-1;i>=1;i--){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;
        // Map<Integer,Integer> hm = new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     int val = nums[i];
        //     if(hm.containsKey(val)){
        //         int pval = hm.get(val);
        //         pval++;
        //         hm.put(val,pval);
        //         if(pval==2){
        //             return true;
        //         }
        //     }else{
        //         hm.put(val,i);
        //     }
        // }
        // return false;
    }
}