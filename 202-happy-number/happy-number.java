class Solution {
    public int square(int num) {
        int ans = 0;
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }

    public boolean isHappy(int n) {
        // int slow = n;
        // int fast = n;
        // do{
        //     slow = square(slow);
        //     fast = square(square(fast));
        // } while(slow != fast);
        // return slow==1;

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        while(n>0){
            int sum = square(n);
            if(hs.contains(sum)){
                if(sum==1){
                    return true;
                }else{
                    return false;
                }
            }else{
                hs.add(sum);
            }
            n = sum;
        }
        return false;
    }
}