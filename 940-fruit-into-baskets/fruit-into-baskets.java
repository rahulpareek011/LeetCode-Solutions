class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int ans = 0;
        int high;
        Map<Integer,Integer> hs = new HashMap<>();

        for(high = 0;high<fruits.length;high++){
            int f = fruits[high];
            if(hs.containsKey(f)){
                int val = hs.get(f);
                hs.put(f,++val);
            }else{
                hs.put(f,1);
            }

            while(hs.size()>2){
                int lv = hs.get(fruits[low]);
                if(lv==1){
                    hs.remove(fruits[low]);
                } else{
                    hs.put(fruits[low],--lv);
                }
                low++;
            }
            ans = Math.max(ans,high-low+1);
        }
        return ans;

        
        
        
        
        
        
        
        // int low = 0;
        // int ans = 0;
        // Map<Integer,Integer> hs = new HashMap<>();
        // for(int high=0;high<fruits.length;high++){
        //     if(hs.containsKey(fruits[high])){
        //         int val = hs.get(fruits[high]);
        //         hs.put(fruits[high],++val);
        //     }else{
        //         hs.put(fruits[high],1);
        //     }
            
        //     if(hs.size()>2){
        //         while(hs.size()>2){
        //             int typeOfFruit = fruits[low++];
        //             if(hs.get(typeOfFruit)>1){
        //                 int val = hs.get(typeOfFruit);
        //                 hs.put(typeOfFruit,--val);
        //             } else{
        //                 hs.remove(typeOfFruit);
        //             }
        //         }
        //     }
        //     ans = Math.max(ans,high-low+1);
        // }
        // return ans;
    }
}