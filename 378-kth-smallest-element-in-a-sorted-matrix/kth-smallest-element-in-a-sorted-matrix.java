class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int s = 1;
        for(int i = 0;i<matrix.length;i++){
            for(int j= 0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
            }
        }
        int n = pq.size();
        for(int i =0;i<n;i++){
            if(i==k-1) return pq.peek();
            pq.poll();
        }
        return -1;
    }
}