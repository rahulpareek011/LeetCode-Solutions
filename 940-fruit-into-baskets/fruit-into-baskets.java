class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int ans = 0;
        Map<Integer,Integer> hs = new HashMap<>();
        for(int high=0;high<fruits.length;high++){
            if(hs.containsKey(fruits[high])){
                int val = hs.get(fruits[high]);
                hs.put(fruits[high],++val);
            }else{
                hs.put(fruits[high],1);
            }
            
            if(hs.size()>2){
                while(hs.size()>2){
                    int typeOfFruit = fruits[low++];
                    if(hs.get(typeOfFruit)>1){
                        int val = hs.get(typeOfFruit);
                        hs.put(typeOfFruit,--val);
                    } else{
                        hs.remove(typeOfFruit);
                    }
                }
            }
            ans = Math.max(ans,high-low+1);
        }
        return ans;
    }
}