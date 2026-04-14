class Solution {
    public int singleNumber(int[] nums) {
        int freq = 0;
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                hs.remove(nums[i]);
            }else{
                hs.put(nums[i],1);
            }
        }
        return hs.keySet().iterator().next();
        
        
        
        
        
        
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i+=2){
        //     if(nums[i]!=nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // //if last element is unique
        // return nums[nums.length-1];
    }
}