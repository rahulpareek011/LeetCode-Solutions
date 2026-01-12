class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int start = timeSeries[0];
        int end = start+duration-1;
        int totDay = 0;
        //finding total seconds
        for(int i=0;i<timeSeries.length;i++){
            if(end<timeSeries[i]){
                totDay= totDay+end-start+1;
                start = timeSeries[i];
                end = start+duration-1; 
            }else{
                end = timeSeries[i]+duration-1;
            }
        }
        totDay+=(end-start+1);
        return totDay;
    }
}