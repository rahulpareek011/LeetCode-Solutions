class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int count = 0;
        int tot = 0;
        for(int i=0;i<apple.length;i++){
            tot+=apple[i];
        }
        System.out.println(tot);
        System.out.println(Arrays.toString(capacity));
        int sum = 0;
        for(int i =capacity.length-1;i>=0;i--){
            if(sum<tot){
                count++;
            }else{
                break;
            }
            sum+=capacity[i];
        }
        return count;
    }
}