class Solution {
    public boolean judgeCircle(String moves) {
        int arr[] = new int[2];
        arr[0] = 0;
        arr[1] = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                arr[0]++;
            }else if(moves.charAt(i)=='L'){
                arr[0]--;
            }else if(moves.charAt(i)=='U'){
                arr[1]++;
            }
            else if(moves.charAt(i)=='D'){
                arr[1]--;
            }
        }
        for(int n:arr){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}