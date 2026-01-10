class Solution {
    // static boolean isPower(int pr,int check){
    //     if(pr==check) return true;
    //     if(pr>check) return false;
    //     return isPower(pr*2,check);
    // }
    public boolean isPowerOfTwo(int n) {
        // if(n==1) return true;
        // int prod = 2;
        // return isPower(prod,n);

        while(n>1){
            if(n%2!=0){
                return false;
            }
            n/=2;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}