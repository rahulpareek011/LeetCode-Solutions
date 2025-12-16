class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++) {
            q.add(i);
        }
        while(true){
            int person = q.poll();
            --tickets[person];
            count++;

            if (tickets[person] == 0) {
                if (person == k) {
                    return count;
                }
            }else{
                q.add(person);
            }
        }
    }
}