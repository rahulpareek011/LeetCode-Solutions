class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for(int n : nums){
            if(n<0){
                neg.add(n);
                continue;
            }
            pos.add(n);
        }

        if(neg.size()==0){
            for(int i = 0;i<pos.size();i++){
                pos.set(i,pos.get(i)*pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }
        if(pos.size()==0){
            for(int i = 0;i<neg.size();i++){
                neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }
        int n = pos.size();
        int m = neg.size();
        int[] res = new int[n+m];

        for(int i = 0;i<neg.size();i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);

        for(int i = 0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }

        int i = 0, j = 0, id = 0;
        while(i< neg.size() && j<pos.size()){
            if(neg.get(i)<pos.get(j)){
                res[id++] = neg.get(i++);
            }else{
                res[id++] = pos.get(j++);
            }
        }
        while(i<neg.size()){
            res[id++] = neg.get(i);
            i++;
        }
        while(j<pos.size()){
            res[id++] = pos.get(j);
            j++;
        }
        return res;
    }
}