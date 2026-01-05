class Solution {
    public int countBattleships(char[][] board) {
        int ans = 0;
        int n = board.length;
        int m = board[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j]=='X'){
                    board[i][j] = '.';
                    ans++;

                    while(j+1<m && board[i][j+1]=='X'){
                        board[i][j+1] = '-';
                        j++;
                    }
                    int temp = i;
                    while(temp+1<n && board[temp+1][j]=='X'){
                        board[temp+1][j] = '-';
                        temp++;
                    }
                }
            }
        }
        return ans;
    }
}