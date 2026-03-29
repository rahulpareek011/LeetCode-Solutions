class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                int val = mp.get(nums[i]);
                mp.put(nums[i],++val);
            }else{
                mp.put(nums[i],1);
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
         for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[1];
        }
        return ans;
    }
}