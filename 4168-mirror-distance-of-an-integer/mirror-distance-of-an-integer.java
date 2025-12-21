class Solution {
    public int mirrorDistance(int n) {
        int tempN = n;
        int sum = 0;
        int reverse = 0;
        while(n!=0) {
            int temp = n%10;
            reverse = reverse*10+temp;
            n = n/10;
        }
        return Math.abs(tempN - reverse);

        
    }
}