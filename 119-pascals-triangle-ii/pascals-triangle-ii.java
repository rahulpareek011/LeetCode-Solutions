class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        if(rowIndex == 0){
            ans.add(1);
            return ans;
        }
         if(rowIndex == 1){
            ans.add(1);
            ans.add(1);
            return ans;
        }
        prev.add(1);
        prev.add(1);
        for(int i=2;i<=rowIndex;i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1; j<prev.size();j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            ans = curr;
            prev = curr;
        }
        return ans;
    }
}