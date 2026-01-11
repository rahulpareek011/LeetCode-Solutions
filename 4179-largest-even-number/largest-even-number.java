class Solution {
    public String largestEven(String s) {
        int index = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                index = i+1;
                break;
            }
        }
        return s.substring(0,index);
    }
}