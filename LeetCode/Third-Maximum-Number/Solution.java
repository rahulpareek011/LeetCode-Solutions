1class Solution {
2    public int thirdMax(int[] nums) {
3        // int firstMax = Integer.MIN_VALUE;
4        // int secondMax = Integer.MIN_VALUE;
5        // int thirdMax = Integer.MIN_VALUE;
6
7        // Arrays.sort(nums);
8        // int uniqueCount = 1;
9
10        // for (int i = 1; i < nums.length; i++) {
11        //     if (nums[i] != nums[i - 1]) {
12        //         uniqueCount++;
13        //     }
14        // }
15
16        // for(int i=0;i<nums.length;i++){
17        //     if(nums[i]>firstMax){
18        //         thirdMax = secondMax;
19        //         secondMax = firstMax;
20        //         firstMax = nums[i];
21        //     }
22        //     else if(nums[i]<firstMax && nums[i]>secondMax){
23        //         thirdMax = secondMax;
24        //         secondMax = nums[i];
25        //     }
26        //     else if(nums[i]<secondMax && nums[i]>thirdMax){
27        //         thirdMax = nums[i];
28        //     }
29        // }
30        // if(uniqueCount<3) return firstMax;
31        // return thirdMax;
32
33
34        Arrays.sort(nums);
35        int dist = 1;
36        int max = nums[nums.length-1];
37
38        for(int i=nums.length-2;i>=0;i--){
39            if(nums[i]!=nums[i+1]){
40                dist++;
41            }
42            if(dist==3){
43                max = nums[i];
44            }
45        }
46        return max;
47    }
48}