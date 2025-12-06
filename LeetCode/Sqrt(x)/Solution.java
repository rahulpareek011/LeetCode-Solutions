1class Solution {
2    public int mySqrt(int x) {
3        int i=0;
4        int j=x;
5        int nearest = 0;
6        while(i<=j){
7            long mid = i+(j-i)/2;
8
9            if(mid*mid==x){
10                return (int)mid;
11            }
12            else if(mid*mid<x){
13                nearest = (int)mid;
14                i = (int)mid+1;
15            } else{
16                j = (int)mid -1;
17            }
18        }
19        return nearest;
20    }
21}