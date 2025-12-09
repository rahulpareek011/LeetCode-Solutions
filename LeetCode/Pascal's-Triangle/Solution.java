1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<Integer> temp = new ArrayList<>();
4        List<List<Integer>> ans = new ArrayList<>();
5        temp.add(1);
6        ans.add(temp);
7        if(numRows==1) return ans;
8        List<Integer> prev = new ArrayList<>();
9        prev.add(1);
10        prev.add(1);
11        ans.add(prev);
12        if(numRows==2) return ans;
13        
14        for(int i=3;i<=numRows;i++){
15            List<Integer> curr = new ArrayList<>();
16            curr.add(1);
17            for(int j=1;j<prev.size();j++){
18                curr.add(prev.get(j-1)+prev.get(j));
19            }
20            curr.add(1);
21            ans.add(curr);
22            prev = curr;
23        }
24        return ans;
25    }
26}